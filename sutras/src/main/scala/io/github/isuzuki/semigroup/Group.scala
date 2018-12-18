package io.github.isuzuki.semigroup

/**
 * 日本語では「半群」
 *
 * 逆元を持つ + Monoid則
 */
trait Group[A] extends Monoid[A] {

  /**
   * Group[Int].inverse(5) = -5
   */
  def inverse(a: A): A
}
