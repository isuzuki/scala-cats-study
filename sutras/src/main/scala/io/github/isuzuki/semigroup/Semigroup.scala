package io.github.isuzuki.semigroup

/**
 * 日本語では「半群」
 *
 * 結合律のみ定義される
 */
trait Semigroup[A] {
  def combine(x: A, y: A): A
}
