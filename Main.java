class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");
    tree.cutShapes(tree.getShape(), 10);
    tree.bakeCookie(350, 12);
    tree.decorate();

    Sugar aCookie = new Sugar();
    aCookie.decorate();
  }
}