package io.github.isuzuki.semigroup

/**
 * 日本語では「有界半束」
 */
trait BoundedSemilattice[A] extends Semilattice[A] with CommutativeMonoid[A] {}
