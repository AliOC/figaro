/*
 * ValuesMaker.scala
 * Trait of elements for which range of values can be computed.
 * 
 * Created By:      Avi Pfeffer (apfeffer@cra.com)
 * Creation Date:   Jan 1, 2009
 * 
 * Copyright 2017 Avrom J. Pfeffer and Charles River Analytics, Inc.
 * See http://www.cra.com or email figaro@cra.com for information.
 * 
 * See http://www.github.com/p2t2/figaro for a copy of the software license.
 */

package com.cra.figaro.algorithm

import com.cra.figaro.language._
import com.cra.figaro.algorithm.lazyfactored.ValueSet

/**
 * Trait of elements for which range of values can be computed. Elements that implement this trait must
 * implement the makeValues method.
 */
trait ValuesMaker[T] extends Element[T] {
  /**
   * Returns the range of values of this element.
   * @param depth The depth of the range computation
   */
  def makeValues(depth: Int): ValueSet[T]
}
