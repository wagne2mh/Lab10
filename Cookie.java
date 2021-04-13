class Cookie {
  private int countCookie;
  private double bakeTemp;
  private int bakeTime;
  private boolean baked;
  


Cookie (){
countCookie = 0;
bakeTemp = 0;
bakeTime = 0; 
baked = false;
}

Cookie (int aCountCookie, double aBakeTemp, int aBakeTime){
  countCookie = aCountCookie;
  bakeTemp = aBakeTemp;
  bakeTime = aBakeTime;
  baked = false;
 
}

boolean getBaked(){
  return baked;
}

void setCountCookie(int newCountCookie ){
countCookie = newCountCookie;
}

void bakeCookie(double aBakeTemp, int aBakeTime){
 System.out.println(countCookie + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes.");
 baked = true;
}

}