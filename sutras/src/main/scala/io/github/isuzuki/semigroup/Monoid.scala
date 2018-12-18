package io.github.isuzuki.semigroup

/**
 * 単位元を持つ + Semigroup則
 */
trait Monoid[A] extends Semigroup[A] {
  def empty: A
}
