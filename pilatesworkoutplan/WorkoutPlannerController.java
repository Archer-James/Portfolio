//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield


package org.example.pilatesworkoutplan;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.Arrays;
import java.util.Random;



import java.math.BigDecimal;

public class WorkoutPlannerController {
    // Sliders for selecting exercises

    private BigDecimal StretchesAmount;
    @FXML
    private Slider stretchesSlider;
    private BigDecimal WarmupAmount;
    @FXML
    private Slider warmupSlider;
    private BigDecimal CardioAmount;
    @FXML
    private Slider cardioSlider;
    private BigDecimal StrengthAmount;
    @FXML
    private Slider strengthSlider;

    // Textfields for org.example.pilatesworkoutplan.Stretch ex1
    @FXML
    private TextField StretchEx1Name;
    @FXML
    private TextField StretchEx1Springs;
    @FXML
    private TextField StretchEx1MG;
    @FXML
    private TextField StretchEx1Link;

    // Textfields for org.example.pilatesworkoutplan.Stretch Ex2
    @FXML
    private TextField StretchEx2Name;
    @FXML
    private TextField StretchEx2Springs;
    @FXML
    private TextField StretchEx2MG;
    @FXML
    private TextField StretchEx2Link;

    // Textfields for org.example.pilatesworkoutplan.Stretch Ex3
    @FXML
    private TextField StretchEx3Name;
    @FXML
    private TextField StretchEx3Springs;
    @FXML
    private TextField StretchEx3MG;
    @FXML
    private TextField StretchEx3Link;

    // Textfields for org.example.pilatesworkoutplan.Stretch Ex4
    @FXML
    private TextField StretchEx4Name;
    @FXML
    private TextField StretchEx4Springs;
    @FXML
    private TextField StretchEx4MG;
    @FXML
    private TextField StretchEx4Link;

    // Textfields for org.example.pilatesworkoutplan.Warmup ex1
    @FXML
    private TextField WarmupEx1Name;
    @FXML
    private TextField WarmupEx1Springs;
    @FXML
    private TextField WarmupEx1MG;
    @FXML
    private TextField WarmupEx1Link;

    // Textfields for org.example.pilatesworkoutplan.Warmup ex2
    @FXML
    private TextField WarmupEx2Name;
    @FXML
    private TextField WarmupEx2Springs;
    @FXML
    private TextField WarmupEx2MG;
    @FXML
    private TextField WarmupEx2Link;

    // Textfields for org.example.pilatesworkoutplan.Warmup ex3
    @FXML
    private TextField WarmupEx3Name;
    @FXML
    private TextField WarmupEx3Springs;
    @FXML
    private TextField WarmupEx3MG;
    @FXML
    private TextField WarmupEx3Link;

    // Textfields for org.example.pilatesworkoutplan.Warmup ex4
    @FXML
    private TextField WarmupEx4Name;
    @FXML
    private TextField WarmupEx4Springs;
    @FXML
    private TextField WarmupEx4MG;
    @FXML
    private TextField WarmupEx4Link;

    // Textfields for org.example.pilatesworkoutplan.Strength ex1
    @FXML
    private TextField StrengthEx1Name;
    @FXML
    private TextField StrengthEx1Springs;
    @FXML
    private TextField StrengthEx1MG;
    @FXML
    private TextField StrengthEx1Link;

    // Textfields for org.example.pilatesworkoutplan.Strength ex2
    @FXML
    private TextField StrengthEx2Name;
    @FXML
    private TextField StrengthEx2Springs;
    @FXML
    private TextField StrengthEx2MG;
    @FXML
    private TextField StrengthEx2Link;

    // Textfields for org.example.pilatesworkoutplan.Strength ex3
    @FXML
    private TextField StrengthEx3Name;
    @FXML
    private TextField StrengthEx3Springs;
    @FXML
    private TextField StrengthEx3MG;
    @FXML
    private TextField StrengthEx3Link;

    // Textfields for org.example.pilatesworkoutplan.Strength ex4
    @FXML
    private TextField StrengthEx4Name;
    @FXML
    private TextField StrengthEx4Springs;
    @FXML
    private TextField StrengthEx4MG;
    @FXML
    private TextField StrengthEx4Link;

    // Textfields for org.example.pilatesworkoutplan.Cardio ex1
    @FXML
    private TextField CardioEx1Name;
    @FXML
    private TextField CardioEx1Springs;
    @FXML
    private TextField CardioEx1MG;
    @FXML
    private TextField CardioEx1Link;

    // Textfields for org.example.pilatesworkoutplan.Cardio ex2
    @FXML
    private TextField CardioEx2Name;
    @FXML
    private TextField CardioEx2Springs;
    @FXML
    private TextField CardioEx2MG;
    @FXML
    private TextField CardioEx2Link;

    // Textfields for org.example.pilatesworkoutplan.Cardio ex3
    @FXML
    private TextField CardioEx3Name;
    @FXML
    private TextField CardioEx3Springs;
    @FXML
    private TextField CardioEx3MG;
    @FXML
    private TextField CardioEx3Link;

    // Textfields for org.example.pilatesworkoutplan.Cardio ex4
    @FXML
    private TextField CardioEx4Name;
    @FXML
    private TextField CardioEx4Springs;
    @FXML
    private TextField CardioEx4MG;
    @FXML
    private TextField CardioEx4Link;

    @FXML
    private void helpButtonPressed(ActionEvent actionEvent) {
        System.out.println("Move the sliders to select the number of each type of exercise you want");
    }

    @FXML
    private void randomizeButtonPressed(ActionEvent event) {

       try {
           //initialize workouts
           Stretch CalfRaise = new Stretch("Calf Raise","RRR", "Calves", "https://www.youtube.com/watch?v=d2GgSoHvIXo");
           Stretch SideSplit = new Stretch("Side Split", "B", "Legs", "https://www.youtube.com/watch?v=U9b40nqTnjo");
           Stretch ReverseMermaid = new Stretch("Reverse Mermaid", "R", "Back", "https://www.youtube.com/watch?v=iEUBi98L16M");
           Stretch LongStretch = new Stretch("Long Stretch", "RY", "Whole Body", "https://www.youtube.com/watch?v=BfRY99Ka-zQ");

           Warmup Lunges = new Warmup("Lunges", "R", "Legs", "https://www.youtube.com/watch?v=wrwwXE_x-pQ");
           Warmup Scooters = new Warmup("Scooters", "R", "Glutes", "https://www.youtube.com/watch?v=eqcPEVEHI1o");
           Warmup Offerings = new Warmup("Offerings", "B", "Chest and Shoulders", "https://www.youtube.com/watch?v=OMRBfugNmaM");
           Warmup ABCurls = new Warmup("AB Curls", "ANY", "Core", "https://www.youtube.com/watch?v=OdKBzlH_hFU");

           Cardio BoxStepUps = new Cardio("Box Step Ups", "ANY", "Legs", "https://www.youtube.com/watch?v=PHGUzLhhsbQ");
           Cardio FlyingSplits = new Cardio("Flying Splits", "RY", "Legs", "https://www.youtube.com/watch?v=A3iHbjhgn90");
           Cardio HeavyHundreds = new Cardio("Heavy Hundreds", "RB", "Core", "https://www.youtube.com/watch?v=vx4DdBWY6kQ");
           Cardio CarriagePress = new Cardio("Carriage Press", "Y", "Core", "https://www.youtube.com/watch?v=wG89lW8qQ1I");

           Strength HamstringCurls = new Strength("Hamstring Curls", "B", "Hamstrings", "https://www.youtube.com/watch?v=mCsuaJZPhn4");
           Strength Windmill = new Strength("Windmill", "B", "Shoulders", "https://www.youtube.com/watch?v=G13FTCpiwJQ");
           Strength KneelingLatPulls = new Strength("Kneeling Lat Pulls", "B", "Lats", "https://www.youtube.com/watch?v=iFewAkIbFpw");
           Strength DrawingSword = new Strength("Drawing a Sword", "Y", "Shoulders","https://www.youtube.com/watch?v=DSqUoipaVhg");

           //null initialized workouts for placeholders
           Stretch StretchNull = new Stretch("","","","");
           Warmup WarmupNull = new Warmup("","","","");
           Cardio CardioNull = new Cardio("","","","");
           Strength StrengthNull = new Strength("","","","");

           //arrays for workouts initialized
           Stretch[] StretchesArray = {CalfRaise, SideSplit, ReverseMermaid, LongStretch};
           Warmup[] WarmupArray = {Lunges, Scooters, Offerings, ABCurls};
           Cardio[] CardioArray = {BoxStepUps, FlyingSplits, HeavyHundreds, CarriagePress};
           Strength[] StrengthArray = {HamstringCurls, Windmill, KneelingLatPulls, DrawingSword};

            //arrays for workouts to be printed
           Stretch[] StretchPrint = {StretchNull,StretchNull,StretchNull,StretchNull};
           Warmup[] WarmupPrint = {WarmupNull,WarmupNull,WarmupNull,WarmupNull};
           Cardio[] CardioPrint = {CardioNull,CardioNull,CardioNull,CardioNull};
           Strength[] StrengthPrint = {StrengthNull,StrengthNull,StrengthNull,StrengthNull};

           //get values for sliders
           int StretchesAmount =(int)stretchesSlider.getValue();
           int WarmupAmount =(int)warmupSlider.getValue();
           int StrengthAmount =(int)strengthSlider.getValue();
           int CardioAmount =(int)cardioSlider.getValue();

           int[] stretchesRandIndeces = new int [StretchesAmount];
           boolean[] chosenStrtch = new boolean[4];
           int count = 0;
           while(count < StretchesAmount) {
               Random r = new Random();
               int randomNumber= r.nextInt(0, 4);
               if (chosenStrtch[randomNumber] == true) {
                   randomNumber = r.nextInt(0,4);
               } else if(chosenStrtch[randomNumber] == false) {
                   chosenStrtch[randomNumber] = true;
                   stretchesRandIndeces[count] = randomNumber;
                   count += 1;
               }
           }


           int[] warmupRandIndeces = new int [WarmupAmount];
           boolean[] chosenWarm = new boolean[4];
           count = 0;
           while(count < WarmupAmount) {
               Random r = new Random();
               int randomNumber= r.nextInt(0, 4);
               if (chosenWarm[randomNumber] == true) {
                   randomNumber = r.nextInt(0,4);
               } else if(chosenWarm[randomNumber] == false) {
                   chosenWarm[randomNumber] = true;
                   warmupRandIndeces[count] = randomNumber;
                   count += 1;
               }
           }


           int[] strengthRandIndeces = new int [StrengthAmount];
           boolean[] chosenStrn = new boolean[4];
           count = 0;
           while(count < StrengthAmount) {
               Random r = new Random();
               int randomNumber= r.nextInt(0, 4);
               if (chosenStrn[randomNumber] == true) {
                   randomNumber = r.nextInt(0,4);
               } else if(chosenStrn[randomNumber] == false) {
                   chosenStrn[randomNumber] = true;
                   strengthRandIndeces[count] = randomNumber;
                   count += 1;
               }
           }

           int[] cardioRandIndeces = new int [CardioAmount];
           boolean[] chosenCard = new boolean[4];
           count = 0;
           while(count < CardioAmount) {
               Random r = new Random();
               int randomNumber= r.nextInt(0, 4);
               if (chosenCard[randomNumber] == true) {
                   randomNumber = r.nextInt(0,4);
               } else if(chosenCard[randomNumber] == false) {
                   chosenCard[randomNumber] = true;
                   cardioRandIndeces[count] = randomNumber;
                   count += 1;
               }
           }

           if(StretchesAmount > 0){
               count = 0;
               for(int index: stretchesRandIndeces){
                   StretchPrint[count] = StretchesArray[index];
                   count += 1;
               }}
           if(WarmupAmount > 0){
               count = 0;
               for(int index: warmupRandIndeces){
                   WarmupPrint[count] = WarmupArray[index];
                   count += 1;
               }}
           if(StrengthAmount > 0){
               count = 0;
                   for(int index: strengthRandIndeces){
                       StrengthPrint[count] = StrengthArray[index];
                       count +=1;
           }}
           if(CardioAmount > 0){
               count = 0;
               for(int index: cardioRandIndeces){
                   CardioPrint[count] = CardioArray[index];
                   count += 1;
               }}






            /*for (int i = 0; i< (int)stretchesSlider.getValue(); i++){
                int index;
                do {
                    index = r.nextInt(StretchesArray.length);
                } while (Arrays.asList(StretchPrint).contains(StretchesArray[index]));

                StretchPrint[i] = StretchPrint[index];
           }*/
            //System.out.println(StretchPrint[1]);


            //org.example.pilatesworkoutplan.Stretch Ex1
           //for( int i=0; i<StretchPrint.length; i++){

           //}
           StretchEx1Name.setText(StretchPrint[0].getName());
           StretchEx1Springs.setText(StretchPrint[0].getSprings());
           StretchEx1MG.setText(StretchPrint[0].getMuscleGroup());
           StretchEx1Link.setText(StretchPrint[0].getLink());

            //org.example.pilatesworkoutplan.Stretch Ex2
            StretchEx2Name.setText(StretchPrint[1].getName());
            StretchEx2Springs.setText(StretchPrint[1].getSprings());
            StretchEx2MG.setText(StretchPrint[1].getMuscleGroup());
            StretchEx2Link.setText(StretchPrint[1].getLink());

            //org.example.pilatesworkoutplan.Stretch Ex3
            StretchEx3Name.setText(StretchPrint[2].getName());
            StretchEx3Springs.setText(StretchPrint[2].getSprings());
            StretchEx3MG.setText(StretchPrint[2].getMuscleGroup());
            StretchEx3Link.setText(StretchPrint[2].getLink());

            //org.example.pilatesworkoutplan.Stretch Ex4
            StretchEx4Name.setText(StretchPrint[3].getName());
            StretchEx4Springs.setText(StretchPrint[3].getSprings());
            StretchEx4MG.setText(StretchPrint[3].getMuscleGroup());
            StretchEx4Link.setText(StretchPrint[3].getLink());

            //org.example.pilatesworkoutplan.Warmup Ex1
            WarmupEx1Name.setText(WarmupPrint[0].getName());
            WarmupEx1Springs.setText(WarmupPrint[0].getSprings());
            WarmupEx1MG.setText(WarmupPrint[0].getMuscleGroup());
            WarmupEx1Link.setText(WarmupPrint[0].getLink());

            //org.example.pilatesworkoutplan.Warmup Ex2
            WarmupEx2Name.setText(WarmupPrint[1].getName());
            WarmupEx2Springs.setText(WarmupPrint[1].getSprings());
            WarmupEx2MG.setText(WarmupPrint[1].getMuscleGroup());
            WarmupEx2Link.setText(WarmupPrint[1].getLink());

            //org.example.pilatesworkoutplan.Warmup Ex3
            WarmupEx3Name.setText(WarmupPrint[2].getName());
            WarmupEx3Springs.setText(WarmupPrint[2].getSprings());
            WarmupEx3MG.setText(WarmupPrint[2].getMuscleGroup());
            WarmupEx3Link.setText(WarmupPrint[2].getLink());

            //org.example.pilatesworkoutplan.Warmup Ex4
            WarmupEx4Name.setText(WarmupPrint[3].getName());
            WarmupEx4Springs.setText(WarmupPrint[3].getSprings());
            WarmupEx4MG.setText(WarmupPrint[3].getMuscleGroup());
            WarmupEx4Link.setText(WarmupPrint[3].getLink());

            //org.example.pilatesworkoutplan.Strength Ex1
            StrengthEx1Name.setText(StrengthPrint[0].getName());
            StrengthEx1Springs.setText(StrengthPrint[0].getSprings());
            StrengthEx1MG.setText(StrengthPrint[0].getMuscleGroup());
            StrengthEx1Link.setText(StrengthPrint[0].getLink());

            //org.example.pilatesworkoutplan.Strength Ex2
            StrengthEx2Name.setText(StrengthPrint[1].getName());
            StrengthEx2Springs.setText(StrengthPrint[1].getSprings());
            StrengthEx2MG.setText(StrengthPrint[1].getMuscleGroup());
            StrengthEx2Link.setText(StrengthPrint[1].getLink());

            //org.example.pilatesworkoutplan.Strength Ex3
            StrengthEx3Name.setText(StrengthPrint[2].getName());
            StrengthEx3Springs.setText(StrengthPrint[2].getSprings());
            StrengthEx3MG.setText(StrengthPrint[2].getMuscleGroup());
            StrengthEx3Link.setText(StrengthPrint[2].getLink());

            //org.example.pilatesworkoutplan.Strength Ex4
            StrengthEx4Name.setText(StrengthPrint[3].getName());
            StrengthEx4Springs.setText(StrengthPrint[3].getSprings());
            StrengthEx4MG.setText(StrengthPrint[3].getMuscleGroup());
            StrengthEx4Link.setText(StrengthPrint[3].getLink());

            //org.example.pilatesworkoutplan.Cardio Ex1
            CardioEx1Name.setText(CardioPrint[0].getName());
            CardioEx1Springs.setText(CardioPrint[0].getSprings());
            CardioEx1MG.setText(CardioPrint[0].getMuscleGroup());
            CardioEx1Link.setText(CardioPrint[0].getLink());

            //org.example.pilatesworkoutplan.Cardio Ex2
            CardioEx2Name.setText(CardioPrint[1].getName());
            CardioEx2Springs.setText(CardioPrint[1].getSprings());
            CardioEx2MG.setText(CardioPrint[1].getMuscleGroup());
            CardioEx2Link.setText(CardioPrint[1].getLink());

            //org.example.pilatesworkoutplan.Cardio Ex3
            CardioEx3Name.setText(CardioPrint[2].getName());
            CardioEx3Springs.setText(CardioPrint[2].getSprings());
            CardioEx3MG.setText(CardioPrint[2].getMuscleGroup());
            CardioEx3Link.setText(CardioPrint[2].getLink());

            //org.example.pilatesworkoutplan.Cardio Ex4
            CardioEx4Name.setText(CardioPrint[3].getName());
            CardioEx4Springs.setText(CardioPrint[3].getSprings());
            CardioEx4MG.setText(CardioPrint[3].getMuscleGroup());
            CardioEx4Link.setText(CardioPrint[3].getLink());
        }
        catch(Exception e) {
            System.out.print("Error occurred");
        }
    }


    // initialize the sliders for stretches, strength, cardio, and warmup
    private void initialize() {
        stretchesSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                 StretchesAmount = BigDecimal.valueOf(stretchesSlider.getValue());
            }

        }
        );

        warmupSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                WarmupAmount = BigDecimal.valueOf(newValue.intValue());
            }
        });

        cardioSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                CardioAmount = BigDecimal.valueOf(newValue.intValue());
            }
        });

        strengthSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                StrengthAmount = BigDecimal.valueOf(newValue.intValue());
            }
        });
    }}
