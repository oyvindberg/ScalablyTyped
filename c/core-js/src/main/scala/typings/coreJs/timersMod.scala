package typings.coreJs

import typings.coreJs.anon.FnCall
import typings.coreJs.anon.Typeofcore
import typings.coreJs.core.Locale
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.MapConstructor
import typings.std.PromiseConstructor
import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import typings.std.SetConstructor
import typings.std.TemplateStringsArray
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersMod {
  
  object Array {
    
    @JSImport("core-js/library/web/timers", "Array.concat")
    @js.native
    def concat[T](array: ArrayLike[T], items: (typings.coreJs.Array[T] | T)*): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.copyWithin")
    @js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.copyWithin")
    @js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.entries")
    @js.native
    def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.every")
    @js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Array.every")
    @js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], end: Double): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.filter")
    @js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.filter")
    @js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.find")
    @js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean]
    ): T = js.native
    @JSImport("core-js/library/web/timers", "Array.find")
    @js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): T = js.native
    
    @JSImport("core-js/library/web/timers", "Array.findIndex")
    @js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
    @JSImport("core-js/library/web/timers", "Array.findIndex")
    @js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Array.forEach")
    @js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit]
    ): Unit = js.native
    @JSImport("core-js/library/web/timers", "Array.forEach")
    @js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T](arrayLike: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T](arrayLike: Iterable[T]): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = js.native
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = js.native
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = js.native
    @JSImport("core-js/library/web/timers", "Array.from")
    @js.native
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.includes")
    @js.native
    def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Array.includes")
    @js.native
    def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Array.indexOf")
    @js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
    @JSImport("core-js/library/web/timers", "Array.indexOf")
    @js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Array.isArray")
    @js.native
    def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Array.join")
    @js.native
    def join[T](array: ArrayLike[T]): java.lang.String = js.native
    @JSImport("core-js/library/web/timers", "Array.join")
    @js.native
    def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "Array.keys")
    @js.native
    def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.lastIndexOf")
    @js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
    @JSImport("core-js/library/web/timers", "Array.lastIndexOf")
    @js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Array.map")
    @js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U]
    ): typings.coreJs.Array[U] = js.native
    @JSImport("core-js/library/web/timers", "Array.map")
    @js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U],
      thisArg: js.Any
    ): typings.coreJs.Array[U] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.of")
    @js.native
    def of[T](items: T*): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.pop")
    @js.native
    def pop[T](array: ArrayLike[T]): T = js.native
    
    @JSImport("core-js/library/web/timers", "Array.push")
    @js.native
    def push[T](array: ArrayLike[T], items: T*): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Array.reduce")
    @js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = js.native
    @JSImport("core-js/library/web/timers", "Array.reduce")
    @js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    
    @JSImport("core-js/library/web/timers", "Array.reduceRight")
    @js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = js.native
    @JSImport("core-js/library/web/timers", "Array.reduceRight")
    @js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    @JSImport("core-js/library/web/timers", "Array.reduceRight")
    @js.native
    def reduceRight_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSImport("core-js/library/web/timers", "Array.reduce")
    @js.native
    def reduce_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSImport("core-js/library/web/timers", "Array.reverse")
    @js.native
    def reverse[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.shift")
    @js.native
    def shift[T](array: ArrayLike[T]): T = js.native
    
    @JSImport("core-js/library/web/timers", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: js.UndefOr[scala.Nothing], end: Double): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: Double): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: Double, end: Double): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.some")
    @js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Array.some")
    @js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Array.sort")
    @js.native
    def sort[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.sort")
    @js.native
    def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.splice")
    @js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.splice")
    @js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typings.coreJs.Array[T] = js.native
    
    @JSImport("core-js/library/web/timers", "Array.turn")
    @js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.turn")
    @js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ],
      memo: typings.coreJs.Array[T]
    ): typings.coreJs.Array[T] = js.native
    @JSImport("core-js/library/web/timers", "Array.turn")
    @js.native
    def turn[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ],
      memo: U
    ): U = js.native
    @JSImport("core-js/library/web/timers", "Array.turn")
    @js.native
    def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): U = js.native
    
    @JSImport("core-js/library/web/timers", "Array.unshift")
    @js.native
    def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Array.values")
    @js.native
    def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
  }
  
  object Date {
    
    @JSImport("core-js/library/web/timers", "Date.format")
    @js.native
    def format(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    @JSImport("core-js/library/web/timers", "Date.format")
    @js.native
    def format(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "Date.formatUTC")
    @js.native
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    @JSImport("core-js/library/web/timers", "Date.formatUTC")
    @js.native
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "Date.now")
    @js.native
    def now(): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Date.toISOString")
    @js.native
    def toISOString(date: typings.coreJs.Date): java.lang.String = js.native
  }
  
  @JSImport("core-js/library/web/timers", "Dict")
  @js.native
  val Dict: DictConstructor = js.native
  
  object Function {
    
    @JSImport("core-js/library/web/timers", "Function.bind")
    @js.native
    def bind(target: typings.coreJs.Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Function.part")
    @js.native
    def part(target: typings.coreJs.Function, args: js.Any*): js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/web/timers", "Map")
  @js.native
  class Map[K, V] ()
    extends typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/web/timers", "Map")
  @js.native
  val Map: MapConstructor = js.native
  
  object Math {
    
    @JSImport("core-js/library/web/timers", "Math.acosh")
    @js.native
    def acosh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.asinh")
    @js.native
    def asinh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.atanh")
    @js.native
    def atanh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.cbrt")
    @js.native
    def cbrt(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.clz32")
    @js.native
    def clz32(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.cosh")
    @js.native
    def cosh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.expm1")
    @js.native
    def expm1(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.fround")
    @js.native
    def fround(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.hypot")
    @js.native
    def hypot(values: Double*): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.imul")
    @js.native
    def imul(x: Double, y: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.log10")
    @js.native
    def log10(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.log1p")
    @js.native
    def log1p(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.log2")
    @js.native
    def log2(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.sign")
    @js.native
    def sign(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.sinh")
    @js.native
    def sinh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.tanh")
    @js.native
    def tanh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Math.trunc")
    @js.native
    def trunc(x: Double): Double = js.native
  }
  
  object Number {
    
    @JSImport("core-js/library/web/timers", "Number")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Number.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/web/timers", "Number.MAX_SAFE_INTEGER")
    @js.native
    def MAX_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/web/timers", "Number.MIN_SAFE_INTEGER")
    @js.native
    def MIN_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/web/timers", "Number.acosh")
    @js.native
    def acosh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.asinh")
    @js.native
    def asinh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.atanh")
    @js.native
    def atanh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.cbrt")
    @js.native
    def cbrt(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.clz32")
    @js.native
    def clz32(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.cosh")
    @js.native
    def cosh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.expm1")
    @js.native
    def expm1(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.fround")
    @js.native
    def fround(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.hypot")
    @js.native
    def hypot(values: Double*): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.imul")
    @js.native
    def imul(x: Double, y: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.isFinite")
    @js.native
    def isFinite(number: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Number.isInteger")
    @js.native
    def isInteger(number: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Number.isNaN")
    @js.native
    def isNaN(number: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Number.isSafeInteger")
    @js.native
    def isSafeInteger(number: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Number.log10")
    @js.native
    def log10(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.log1p")
    @js.native
    def log1p(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.log2")
    @js.native
    def log2(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.parseFloat")
    @js.native
    def parseFloat(string: java.lang.String): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.parseInt")
    @js.native
    def parseInt(string: java.lang.String): Double = js.native
    @JSImport("core-js/library/web/timers", "Number.parseInt")
    @js.native
    def parseInt(string: java.lang.String, radix: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.random")
    @js.native
    def random(): Double = js.native
    @JSImport("core-js/library/web/timers", "Number.random")
    @js.native
    def random(lim: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.sign")
    @js.native
    def sign(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.sinh")
    @js.native
    def sinh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.tanh")
    @js.native
    def tanh(x: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "Number.trunc")
    @js.native
    def trunc(x: Double): Double = js.native
  }
  
  object Object {
    
    @JSImport("core-js/library/web/timers", "Object.assign")
    @js.native
    def assign(target: js.Any, sources: js.Any*): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.classof")
    @js.native
    def classof(value: js.Any): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "Object.create")
    @js.native
    def create(o: js.Any): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Object.create")
    @js.native
    def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.define")
    @js.native
    def define[T](target: T, mixin: js.Any): T = js.native
    
    @JSImport("core-js/library/web/timers", "Object.defineProperties")
    @js.native
    def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.defineProperty")
    @js.native
    def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.entries")
    @js.native
    def entries(`object`: js.Any): Array[_] = js.native
    
    @JSImport("core-js/library/web/timers", "Object.freeze")
    @js.native
    def freeze[T](o: T): T = js.native
    
    @JSImport("core-js/library/web/timers", "Object.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    
    @JSImport("core-js/library/web/timers", "Object.getOwnPropertyDescriptors")
    @js.native
    def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
    
    @JSImport("core-js/library/web/timers", "Object.getOwnPropertyNames")
    @js.native
    def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
    
    @JSImport("core-js/library/web/timers", "Object.getOwnPropertySymbols")
    @js.native
    def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
    
    @JSImport("core-js/library/web/timers", "Object.getPrototypeOf")
    @js.native
    def getPrototypeOf(o: js.Any): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.is")
    @js.native
    def is(value1: js.Any, value2: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Object.isExtensible")
    @js.native
    def isExtensible(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Object.isFrozen")
    @js.native
    def isFrozen(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Object.isObject")
    @js.native
    def isObject(value: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Object.isSealed")
    @js.native
    def isSealed(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Object.keys")
    @js.native
    def keys(o: js.Any): Array[java.lang.String] = js.native
    
    @JSImport("core-js/library/web/timers", "Object.make")
    @js.native
    def make[T](proto: T): T = js.native
    @JSImport("core-js/library/web/timers", "Object.make")
    @js.native
    def make[T](proto: T, mixin: js.Any): T = js.native
    
    @JSImport("core-js/library/web/timers", "Object.preventExtensions")
    @js.native
    def preventExtensions[T](o: T): T = js.native
    
    @JSImport("core-js/library/web/timers", "Object.seal")
    @js.native
    def seal[T](o: T): T = js.native
    
    @JSImport("core-js/library/web/timers", "Object.setPrototypeOf")
    @js.native
    def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Object.values")
    @js.native
    def values(`object`: js.Any): Array[_] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/web/timers", "Promise")
  @js.native
  class Promise[T] protected ()
    extends typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("core-js/library/web/timers", "Promise")
  @js.native
  val Promise: PromiseConstructor = js.native
  
  object Reflect {
    
    @JSImport("core-js/library/web/timers", "Reflect.apply")
    @js.native
    def apply(target: Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.construct")
    @js.native
    def construct(target: Function, argumentsList: ArrayLike[_]): js.Any = js.native
    
    /**
      * Define a unique metadata entry on the target.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param metadataValue A value that contains attached metadata.
      * @param target The target object on which to define metadata.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  Reflect.defineMetadata("custom:annotation", options, Example);
      *
      *  // decorator factory as metadata-producing annotation.
      *  function MyAnnotation(options): ClassDecorator {
      *      return target => Reflect.defineMetadata("custom:annotation", options, target);
      *  }
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = js.native
    @JSImport("core-js/library/web/timers", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = js.native
    @JSImport("core-js/library/web/timers", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.defineProperty")
    @js.native
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = js.native
    
    /**
      * Deletes the metadata entry from the target object with the provided key.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata entry was found and deleted; otherwise, false.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.deleteMetadata("custom:annotation", Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.deleteProperty")
    @js.native
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
    
    /**
      * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadata("custom:annotation", Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.getMetadata")
    @js.native
    def getMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getMetadata")
    @js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getMetadata")
    @js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
    
    /**
      * Gets the metadata keys defined on the target object or its prototype chain.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadataKeys(Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.getMetadataKeys")
    @js.native
    def getMetadataKeys(target: Object): Array[_] = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getMetadataKeys")
    @js.native
    def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getMetadataKeys")
    @js.native
    def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    
    /**
      * Gets the metadata value for the provided metadata key on the target object.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadata("custom:annotation", Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadata")
    @js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadata")
    @js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadata")
    @js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
    
    /**
      * Gets the unique metadata keys defined on the target object.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadataKeys(Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object): Array[_] = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    @JSImport("core-js/library/web/timers", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.getPrototypeOf")
    @js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.has")
    @js.native
    def has(target: js.Any, propertyKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.has")
    @js.native
    def has(target: js.Any, propertyKey: js.Symbol): Boolean = js.native
    
    /**
      * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasMetadata("custom:annotation", Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.hasMetadata")
    @js.native
    def hasMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.hasMetadata")
    @js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.hasMetadata")
    @js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    /**
      * Gets a value indicating whether the target object has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasOwnMetadata("custom:annotation", Example);
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.isExtensible")
    @js.native
    def isExtensible(target: js.Any): Boolean = js.native
    
    /**
      * A default metadata decorator factory that can be used on a class, class member, or parameter.
      * @param metadataKey The key for the metadata entry.
      * @param metadataValue The value for the metadata entry.
      * @returns A decorator function.
      * @remarks
      * If `metadataKey` is already defined for the target and target key, the
      * metadataValue for that key will be overwritten.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  // constructor
      *  @Reflect.metadata(key, value)
      *  class Example {
      *  }
      *
      *  // property (on constructor, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticProperty;
      *  }
      *
      *  // property (on prototype, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      property;
      *  }
      *
      *  // method (on constructor)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticMethod() { }
      *  }
      *
      *  // method (on prototype)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      method() { }
      *  }
      * ```
      */
    @JSImport("core-js/library/web/timers", "Reflect.metadata")
    @js.native
    def metadata(metadataKey: js.Any, metadataValue: js.Any): FnCall = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.ownKeys")
    @js.native
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.preventExtensions")
    @js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    @JSImport("core-js/library/web/timers", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "Reflect.setPrototypeOf")
    @js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  object RegExp {
    
    @JSImport("core-js/library/web/timers", "RegExp.escape")
    @js.native
    def escape(str: java.lang.String): java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/web/timers", "Set")
  @js.native
  class Set[T] ()
    extends typings.std.Set[T] {
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/web/timers", "Set")
  @js.native
  val Set: SetConstructor = js.native
  
  object String {
    
    @JSImport("core-js/library/web/timers", "String.at")
    @js.native
    def at(text: java.lang.String, index: Double): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.codePointAt")
    @js.native
    def codePointAt(text: java.lang.String, pos: Double): Double = js.native
    
    @JSImport("core-js/library/web/timers", "String.endsWith")
    @js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "String.endsWith")
    @js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "String.escapeHTML")
    @js.native
    def escapeHTML(text: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.fromCodePoint")
    @js.native
    def fromCodePoint(codePoints: Double*): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.includes")
    @js.native
    def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "String.includes")
    @js.native
    def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "String.padEnd")
    @js.native
    def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
    @JSImport("core-js/library/web/timers", "String.padEnd")
    @js.native
    def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.padStart")
    @js.native
    def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
    @JSImport("core-js/library/web/timers", "String.padStart")
    @js.native
    def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.raw")
    @js.native
    def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.repeat")
    @js.native
    def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
    
    @JSImport("core-js/library/web/timers", "String.startsWith")
    @js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/library/web/timers", "String.startsWith")
    @js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    @JSImport("core-js/library/web/timers", "String.unescapeHTML")
    @js.native
    def unescapeHTML(text: java.lang.String): java.lang.String = js.native
  }
  
  @JSImport("core-js/library/web/timers", "Symbol")
  @js.native
  val Symbol: SymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/web/timers", "WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.std.WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/web/timers", "WeakMap")
  @js.native
  val WeakMap: WeakMapConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/web/timers", "WeakSet")
  @js.native
  class WeakSet[T /* <: js.Object */] ()
    extends typings.std.WeakSet[T] {
    def this(iterable: Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/web/timers", "WeakSet")
  @js.native
  val WeakSet: WeakSetConstructor = js.native
  
  @JSImport("core-js/library/web/timers", "_")
  @js.native
  val _underscore: Boolean = js.native
  
  @JSImport("core-js/library/web/timers", "addLocale")
  @js.native
  def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = js.native
  
  @JSImport("core-js/library/web/timers", "clearImmediate")
  @js.native
  def clearImmediate(handle: Double): Unit = js.native
  
  @JSImport("core-js/library/web/timers", "delay")
  @js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  
  @JSImport("core-js/library/web/timers", "getIterator")
  @js.native
  def getIterator[T](iterable: Iterable[T]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("core-js/library/web/timers", "global")
  @js.native
  val global: js.Any = js.native
  
  @JSImport("core-js/library/web/timers", "isIterable")
  @js.native
  def isIterable(value: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/web/timers", "locale")
  @js.native
  def locale(): java.lang.String = js.native
  @JSImport("core-js/library/web/timers", "locale")
  @js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/library/web/timers", "setImmediate")
  @js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/library/web/timers", "setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSImport("core-js/library/web/timers", "setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/library/web/timers", "setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSImport("core-js/library/web/timers", "setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/library/web/timers", "version")
  @js.native
  val version: java.lang.String = js.native
  
  @JSImport("core-js/library/web/timers", "$for")
  @js.native
  def `for`[T](iterable: Iterable[T]): typings.coreJs.`for`[T] = js.native
}
