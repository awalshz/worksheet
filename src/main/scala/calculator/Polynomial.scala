package calculator

object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
      c: Signal[Double]): Signal[Double] = Signal{
    val a_ = a()
    val b_ = b()
    val c_ = c()
    b_ * b_ - 4 * a_ * c_
  }

  def computeSolutions(a: Signal[Double], b: Signal[Double],
       c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = Signal{

    if (delta() < 0) Set()
    else if (delta() == 0) Set(-b() / (2 * a()))
    else Set((-b() - math.sqrt(delta())) / (2 *a()), (-b() + math.sqrt(delta())) / (2 *a()))
  }
}
