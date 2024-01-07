import Enums.*;
import Exceptions.InputException;
import Objects.Entity;
import Objects.Place;
import Objects.PlaceTime;
import Objects.Thing;
import Interfaces.AssotiativeMassive;
import java.util.Scanner;
import java.util.HashMap;
import Interfaces.Inputable;

import java.util.Map;
import java.util.Random;


public class Main {



    public static void main(String[] args){
        Entity tr = new Entity("123",Gender.Male);
        class MyObjects{
            Map<String,Entity> entityes = new HashMap<>();
            Map<String,Place> places = new HashMap<>();
            Map<String,Thing> things = new HashMap<>();
            public MyObjects(){
                entityes.put("he",new Entity("он ", Gender.Male));
                entityes.put("paper",new Entity("бумаг",Gender.Female));
                entityes.put("piggy",new Entity("Пятачок", Gender.Male));
                entityes.put("she",new Entity("она",Gender.Female));
                entityes.put("eyes",new Entity("глаза ",Gender.All));
                entityes.put("him",new Entity("у него ",Gender.Male));
                entityes.put("remakehim",new Entity("ему",Gender.Male));
                entityes.put("her",new Entity("её",Gender.Female));
                entityes.put("somebody",new Entity("кто-нибудь",Gender.Male));
                entityes.put("rain",new Entity("дождь",Gender.Male));
                entityes.put("winnyPux",new Entity("Винни-Пух",Gender.Male));
                things.put("desert",new Thing("сухую"));
                things.put("ripples",new Thing("рябь"));
                things.put("house",new Thing("весь дом"));
                things.put("all",new Thing("всё"));
                things.put("pen",new Thing("карандаш"));
                things.put("piece",new Thing("сухой кусочек"));
                places.put("bottle",new Place("бутылк"));
                places.put("window",new Place("окошк"));
                places.put("onWater",new Place("на воде"));
                places.put("onPaper",new Place("на бумажке"));
                places.put("inWater",new Place("в воду"));
                places.put("oneWayOfPaper",new Place("на обратной стороне бумажки"));


            }
            public Entity getEntity(String name){
                return entityes.get(name);
            }
            public Place getPlace(String name){
                return places.get(name);
            }
            public Thing getThing(String name){
                return things.get(name);
            }

        }
        //объекты, которые могут действовать
        Scanner scanner = new Scanner(System.in);
        System.out.print("В истории про Винни-Пуха Пятачок ищет сухие предметы, введите локацию где будет искать Пятачок (снаружи/внутри) ");
        String inputstring = scanner.nextLine();
        scanner.close();
        Entity he = new Entity("он ", Gender.Male);
        Entity paper = new Entity("бумаг",Gender.Female);
        Entity piggy = new Entity("Пятачок", Gender.Male);
        Entity she = new Entity("она",Gender.Female);
        Entity eyes = new Entity("глаза ",Gender.All);
        Entity him = new Entity("у него ",Gender.Male);
        Entity remakehim = new Entity("ему",Gender.Male);
        Entity her = new Entity("её",Gender.Female);
        Entity somebody = new Entity("кто-нибудь",Gender.Male);
        Entity rain = new Entity("дождь",Gender.Male);
        Entity winnyPux = new Entity("Винни-Пух",Gender.Male);



        //объекты не умеющие действовать
        Thing desert = new Thing("сухую");
        Thing ripples = new Thing("рябь");
        Thing house = new Thing("весь дом ");
        Thing all = new Thing("всё");
        Thing pen = new Thing("карандаш");
        Thing piece = new Thing("сухой кусочек");
        //объекты места
        Place bottle = new Place("бутылк");
        Place window = new Place("окошк");
        Place onWater = new Place("на воде");
        Place onPaper = new Place("на бумажке");
        Place inWater = new Place("в воду");
        Place oneWayOfPaper = new Place("на обратной стороне бумажки");

        try {
            processInput(inputstring);
        } catch (InputException e) {
            System.out.println("поймал ошибку");;
        }
        //Создаем локальный класс
        class Story{
            public boolean Flag= true;

            Thing houseState = new Thing(""){ // анонимный класс
                @Override
                public void getStatement(CoordinateEnum coordinate) {
                    //if (Math.random() <=1 && coordinate == CoordinateEnum.OutSide) {//КИНУТЬ ФРОВ ОБ ОКОНЧАНИИ ПРОГИ
                    if (0.25 < 1){
                        System.out.print("снаружи ");
                        Flag = false;
                    }else {
                        System.out.print("внутри ");

                    }
                }
            };
           public void makeStory(){
               houseState.getStatement(CoordinateEnum.OutSide);
               if (Flag == true){

                   System.out.println("Здравствуйте читатель, вам попалась история про Пятачка №1");
                   // докинуть throws ( ошибку )
                   System.out.println("=================================================================================\n");
                   //1 предолжение
                   piggy.doSomething(Action.Thinks);
                   he.amplify(Conditions.ThatIf);
                   he.doSomeThingSomeWhere(Action.Write,onPaper);
                   System.out.print(",");
                   piggy.doSomethingAboutSb(Action.Put,her);
                   piggy.doSomeThingSomeWhere(Action.Put,bottle);
                   System.out.print("и ");
                   piggy.doSomeThingSomeWhere(Action.Throw,inWater);
                   System.out.print(",то, ");
                   piggy.amplify(Conditions.Maybe);
                   somebody.bothActions(Action.Come,Action.Save,him);
                   System.out.println("-");
                   //2 предложение
                   he.doSomethingAboutSb(Action.Search,house);
                   Thing.EndSentence.endMessage(",вернее ");// использование вложенного статик класса
                   all.amplify(Conditions.That);
                   houseState.getStatement(CoordinateEnum.OutSide);
                   System.out.println("промокло");
               }else {
                   System.out.println("#123");
                   // докинуть throws ( ошибку )
                   System.out.println("=================================================================================\n");
                   //1 предолжение
                   piggy.doSomething(Action.Thinks);
                   he.amplify(Conditions.ThatIf);
                   he.doSomeThingSomeWhere(Action.Write, onPaper);
                   System.out.print(",");
                   piggy.doSomethingAboutSb(Action.Put, her);
                   piggy.doSomeThingSomeWhere(Action.Put, bottle);
                   System.out.print("и ");
                   piggy.doSomeThingSomeWhere(Action.Throw, inWater);
                   System.out.print(",то, ");
                   piggy.amplify(Conditions.Maybe);
                   somebody.bothActions(Action.Come, Action.Save, him);
                   System.out.println("-");
                   //2 предложение
                   he.doSomethingAboutSb(Action.Search, house);
                   //Thing.EndSentence.endMessage(",вернее ");// использование вложенного статик класса
                   all.amplify(Conditions.That);
                   houseState.getStatement(CoordinateEnum.OutSide);
                   he.doSomething(Action.Stay);
                   he.amplify(Conditions.Finally);
                   pen.getProperty("сухой");
                   he.doSomethingAboutSb(Action.Found, pen);
                   System.out.print(",");
                   piece.implie(paper);
                   he.doSomeThingSomeWhere(Action.Wrote, oneWayOfPaper);

                   //3 предложение
                   System.out.println("-");
                   PlaceTime.setTime(Time.Then);
                   he.doSomethingAbSbSomeWhere(Action.Put, bottle, paper);
                   System.out.print(",");
                   he.amplify(Conditions.Better);
                   he.doSomethingAboutSb(Action.Clogged, bottle);
                   System.out.print(",");
                   he.amplify(Conditions.Defolt);
                   he.getCoordinate(CoordinateEnum.Far);
                   he.doSomethingAboutSb(Action.LeanedOut, window);
                   System.out.print("--");
                   he.amplify(Conditions.But);
                   he.doSomething(Action.DropOut);
                   System.out.print(",--и");
                   he.amplify(Conditions.PowerFull);
                   he.doSomethingAboutSb(Action.Throw, bottle);
                   System.out.print(".");
                   he.amplify(Conditions.That);
                   desert.implie(bottle);


                   //4 предложение
                   System.out.print("-\n");
                   piggy.doSomething(Action.Watch);
                   System.out.print(",");
                   she.amplify(Conditions.How);
                   she.getProperty("медленно");
                   she.doSomething(Action.Swim);
                   him.amplify(Conditions.While);
                   eyes.doSomething(Action.Hurt);
                   System.out.print(", и ");
                   remakehim.doSomething(Action.Stand);
                   PlaceTime.setTime(Time.Sometimes);
                   remakehim.doSomething(Action.Seem);
                   bottle.amplify(Conditions.ThatIs);
                   remakehim.amplify(Conditions.ThatIs);
                   System.out.print(",a ");
                   PlaceTime.setTime(Time.Sometimes);
                   ripples.implie(onWater);
                   ripples.amplify(Conditions.ThatIs);
                   System.out.print(",и");
                   he.amplify(Conditions.Finally);
                   he.doSomething(Action.Understood);
                   System.out.print("-\n");
                   he.amplify(Conditions.That);
                   he.getProperty("больше");
                   he.doSomethingAboutSb(Action.See, her);
                   System.out.print(" и ");
                   he.amplify(Conditions.That);
                   he.bothActions(Action.Done, Action.Could);
                   System.out.print(".");
                   //5 предложение
                   PlaceTime.setTime(Time.When);
                   rain.doSomething(Action.Started);
                   winnyPux.doSomething(Action.Sleep);
                   rain.bothActions(Action.Goes, Action.Goes);
                   System.out.print(",a ");
                   he.bothActions(Action.Sleep, Action.Sleep);
                   System.out.print(".");
                   //6 предложение
                   PlaceTime.setTime(Time.Earlier);
                   he.amplify(Conditions.Very);
                   he.doSomething(Action.Tired);


                   System.out.println("\n\n=================================================================================");


               }





                /*// докинуть throws ( ошибку )
                System.out.println("=================================================================================\n");
                //1 предолжение
                piggy.doSomething(Action.Thinks);
                he.amplify(Conditions.ThatIf);
                he.doSomeThingSomeWhere(Action.Write,onPaper);
                System.out.print(",");
                piggy.doSomethingAboutSb(Action.Put,her);
                piggy.doSomeThingSomeWhere(Action.Put,bottle);
                System.out.print("и ");
                piggy.doSomeThingSomeWhere(Action.Throw,inWater);
                System.out.print(",то, ");
                piggy.amplify(Conditions.Maybe);
                somebody.bothActions(Action.Come,Action.Save,him);
                System.out.println("-");
                //2 предложение
                he.doSomethingAboutSb(Action.Search,house);
                Thing.EndSentence.endMessage(",вернее ");// использование вложенного статик класса
                all.amplify(Conditions.That);
                houseState.getStatement(CoordinateEnum.OutSide);
                he.doSomething(Action.Stay);
                he.amplify(Conditions.Finally);
                pen.getProperty("сухой");
                he.doSomethingAboutSb(Action.Found,pen);
                System.out.print(",");
                piece.implie(paper);
                he.doSomeThingSomeWhere(Action.Wrote,oneWayOfPaper);

               //3 предложение
                System.out.println("-");
                PlaceTime.setTime(Time.Then);
                he.doSomethingAbSbSomeWhere(Action.Put,bottle,paper);
                System.out.print(",");
                he.amplify(Conditions.Better);
                he.doSomethingAboutSb(Action.Clogged,bottle);
                System.out.print(",");
                he.amplify(Conditions.Defolt);
                he.getCoordinate(CoordinateEnum.Far);
                he.doSomethingAboutSb(Action.LeanedOut,window);
                System.out.print("--");
                he.amplify(Conditions.But);
                he.doSomething(Action.DropOut);
                System.out.print(",--и");
                he.amplify(Conditions.PowerFull);
                he.doSomethingAboutSb(Action.Throw,bottle);
                System.out.print(".");
                he.amplify(Conditions.That);
                desert.implie(bottle);





                //4 предложение
                System.out.print("-\n");
                piggy.doSomething(Action.Watch);
                System.out.print(",");
                she.amplify(Conditions.How);
                she.getProperty("медленно");
                she.doSomething(Action.Swim);
                him.amplify(Conditions.While);
                eyes.doSomething(Action.Hurt);
                System.out.print(", и ");
                remakehim.doSomething(Action.Stand);
                PlaceTime.setTime(Time.Sometimes);
                remakehim.doSomething(Action.Seem);
                bottle.amplify(Conditions.ThatIs);
                remakehim.amplify(Conditions.ThatIs);
                System.out.print(",a ");
                PlaceTime.setTime(Time.Sometimes);
                ripples.implie(onWater);
                ripples.amplify(Conditions.ThatIs);
                System.out.print(",и");
                he.amplify(Conditions.Finally);
                he.doSomething(Action.Understood);
                System.out.print("-\n");
                he.amplify(Conditions.That);
                he.getProperty("больше");
                he.doSomethingAboutSb(Action.See,her);
                System.out.print(" и ");
                he.amplify(Conditions.That);
                he.bothActions(Action.Done,Action.Could);
                System.out.print(".");
                //5 предложение
               PlaceTime.setTime(Time.When);
               rain.doSomething(Action.Started);
               winnyPux.doSomething(Action.Sleep);
               rain.bothActions(Action.Goes,Action.Goes);
               System.out.print(",a");
               he.bothActions(Action.Sleep,Action.Sleep);
               System.out.print(".");
               //6 предложение
               PlaceTime.setTime(Time.Earlier);
               he.amplify(Conditions.Very);
               he.doSomething(Action.Tired);


                System.out.println("\n\n=================================================================================");*/
            }
        }

        Story WinniPuhStory = new Story();
        WinniPuhStory.makeStory();









        //проверка на одного и того же человека с помощью пола + имя(не важен регистр)
        Entity e1 = new Entity("name1", Gender.Male);
        Entity e2 = new Entity("Name1", Gender.Male);

        System.out.println(e1.equals(e2));
        System.out.println(e1);

    }


    public static void processInput(String inputstring) throws InputException {



        if (inputstring.equals("снаружи")){
            System.out.println("1 история");

        }else if (inputstring.equals("внутри")){
            System.out.println("2 история");

        }else {
            throw new InputException("");
        }


    }

}