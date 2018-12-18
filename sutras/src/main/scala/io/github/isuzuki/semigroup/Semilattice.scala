package io.github.isuzuki.semigroup

/**
 * 日本語では「半束」
 */
trait Semilattice[A] extends Band[A] with CommutativeSemigroup[A] {}
