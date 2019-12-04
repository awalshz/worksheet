val m = Map((1,1), (2, 2), (3,3))
m map {case (i, j) => (i, j+1)}


class HelloThread extends Thread {
  override def run() {
    println("Hola Mundo")
  }
}