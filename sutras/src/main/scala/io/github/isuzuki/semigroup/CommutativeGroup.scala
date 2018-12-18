package io.github.isuzuki.semigroup

/**
 * 日本語では「可換群」、「アーベル群」と言われている
 */
trait CommutativeGroup[A] extends Group[A] with CommutativeMonoid[A] {}
