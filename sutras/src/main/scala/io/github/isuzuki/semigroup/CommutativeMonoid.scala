package io.github.isuzuki.semigroup

/**
 * 日本語では「可換モノイド」
 */
trait CommutativeMonoid[A] extends Monoid[A] with CommutativeSemigroup[A] {}
