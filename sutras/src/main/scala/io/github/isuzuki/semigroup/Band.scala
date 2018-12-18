package io.github.isuzuki.semigroup

/**
 * 冪等operationとなる半群、日本語名は不明
 * idempotentは冪等の英単語
 */
trait Band[A] extends Semigroup[A] {}
