import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Game game = new Game();

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("game", game);
      model.put("players", Player.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("game", game);
      Player newWord = new Player(request.queryParams("playerName"));
      if(Player.all().size()==4) {
        game.addPlayers(Player.all());
        game.startGame();
      }
      model.put("players", Player.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/players/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Player player = Player.find(Integer.parseInt(request.params(":id")));
      model.put("player", player);
      model.put("template", "templates/player.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Word newWord = new Word(request.queryParams("word1"));
      model.put("words", Word.all());
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Definition newDef = new Definition(request.queryParams("def1"));
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      word.addDefinition(newDef);
      model.put("word", word);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
