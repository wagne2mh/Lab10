class Sugar extends Cookie {
  private String shape;
  private boolean decorated;

 Sugar() {
shape = "";
decorated = false;
}

 Sugar(String aShape) {
shape = aShape;
 decorated = false;
}

String getShape(){
  return shape;
}

void setShape(String aShape){
  shape = aShape;

}

void cutShapes(String cutShape, int countCut ){
System.out.println(countCut + " cookies were cut into " + cutShape);
super.setCountCookie(countCut);
}

void decorate(){
 if( super.getBaked()){
   decorated = true;
   System.out.println("The cookies were decorated.");
 }
 else {
System.out.println("Make sure to bake the cookies first.");
 }
 
 

}


}