int y = 0;
int x = 10;
int score = 0;
void setup(){ 
  size(1000, 500);

}
void draw(){
  y = y+10;
  if (y >= 500){
   checkCatch(x);
    x = (int)random(1000);
  
  y = 0;
  }
  background(255, 255, 255);
  fill(0, x, 255);
ellipse(x, y, 10, 20);
  stroke(0, 255, 0);

fill(220,220,220);
stroke(255,255,255);
 rect(mouseX, 475, 100, 35);
 
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
       
    }
