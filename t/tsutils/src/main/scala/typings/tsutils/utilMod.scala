package typings.tsutils

import typings.std.Map
import typings.tsutils.anon.BindingElementnameIdentif
import typings.tsutils.anon.Name
import typings.tsutils.controlFlowMod.ControlFlowEnd
import typings.tsutils.convertAstMod.ConvertedAst
import typings.tsutils.convertAstMod.NodeWrap
import typings.tsutils.tsutilsStrings.CarriagereturnLinefeed
import typings.tsutils.tsutilsStrings.Linefeed
import typings.tsutils.tsutilsStrings.stripInternal
import typings.tsutils.usageMod.DeclarationDomain
import typings.tsutils.usageMod.UsageDomain
import typings.tsutils.usageMod.VariableInfo
import typings.tsutils.utilUtilMod.AccessKind
import typings.tsutils.utilUtilMod.BooleanCompilerOptions
import typings.tsutils.utilUtilMod.ForEachCommentCallback
import typings.tsutils.utilUtilMod.ForEachTokenCallback
import typings.tsutils.utilUtilMod.ImportKind
import typings.tsutils.utilUtilMod.ImportLike
import typings.tsutils.utilUtilMod.LateBoundPropertyNames
import typings.tsutils.utilUtilMod.LineRange
import typings.tsutils.utilUtilMod.ScopeBoundary
import typings.tsutils.utilUtilMod.SideEffectOptions
import typings.tsutils.utilUtilMod.StrictCompilerOption
import typings.tsutils.utilUtilMod.VariableDeclarationKind
import typings.tsutils.utilUtilMod.WellKnownSymbolLiteral
import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.AssertionExpression
import typings.typescript.mod.BindingElement
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.BlockLike
import typings.typescript.mod.CallExpression
import typings.typescript.mod.CheckJsDirective
import typings.typescript.mod.ClassElement
import typings.typescript.mod.ClassLikeDeclaration
import typings.typescript.mod.CommentRange
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Expression
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDoc
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModifierFlags
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.NoSubstitutionTemplateLiteral
import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.ObjectType
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.Signature
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.SyntaxKind.AbstractKeyword
import typings.typescript.mod.SyntaxKind.AsyncKeyword
import typings.typescript.mod.SyntaxKind.ConstKeyword
import typings.typescript.mod.SyntaxKind.DeclareKeyword
import typings.typescript.mod.SyntaxKind.DefaultKeyword
import typings.typescript.mod.SyntaxKind.ExportKeyword
import typings.typescript.mod.SyntaxKind.PrivateKeyword
import typings.typescript.mod.SyntaxKind.ProtectedKeyword
import typings.typescript.mod.SyntaxKind.PublicKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.StaticKeyword
import typings.typescript.mod.Token
import typings.typescript.mod.Type
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("tsutils/util", "AccessKind")
  @js.native
  object AccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.AccessKind with Double] = js.native
    
    /* 4 */ val Delete: typings.tsutils.utilUtilMod.AccessKind.Delete with Double = js.native
    
    /* 6 */ val Modification: typings.tsutils.utilUtilMod.AccessKind.Modification with Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.AccessKind.None with Double = js.native
    
    /* 1 */ val Read: typings.tsutils.utilUtilMod.AccessKind.Read with Double = js.native
    
    /* 3 */ val ReadWrite: typings.tsutils.utilUtilMod.AccessKind.ReadWrite with Double = js.native
    
    /* 2 */ val Write: typings.tsutils.utilUtilMod.AccessKind.Write with Double = js.native
  }
  
  @JSImport("tsutils/util", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.usageMod.DeclarationDomain with Double] = js.native
    
    /* 7 */ val Any: typings.tsutils.usageMod.DeclarationDomain.Any with Double = js.native
    
    /* 8 */ val Import: typings.tsutils.usageMod.DeclarationDomain.Import with Double = js.native
    
    /* 1 */ val Namespace: typings.tsutils.usageMod.DeclarationDomain.Namespace with Double = js.native
    
    /* 2 */ val Type: typings.tsutils.usageMod.DeclarationDomain.Type with Double = js.native
    
    /* 4 */ val Value: typings.tsutils.usageMod.DeclarationDomain.Value with Double = js.native
  }
  
  @JSImport("tsutils/util", "ImportKind")
  @js.native
  object ImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ImportKind with Double] = js.native
    
    /* 63 */ val All: typings.tsutils.utilUtilMod.ImportKind.All with Double = js.native
    
    /* 24 */ val AllImportExpressions: typings.tsutils.utilUtilMod.ImportKind.AllImportExpressions with Double = js.native
    
    /* 59 */ val AllImports: typings.tsutils.utilUtilMod.ImportKind.AllImports with Double = js.native
    
    /* 18 */ val AllRequireLike: typings.tsutils.utilUtilMod.ImportKind.AllRequireLike with Double = js.native
    
    /* 3 */ val AllStaticImports: typings.tsutils.utilUtilMod.ImportKind.AllStaticImports with Double = js.native
    
    /* 8 */ val DynamicImport: typings.tsutils.utilUtilMod.ImportKind.DynamicImport with Double = js.native
    
    /* 4 */ val ExportFrom: typings.tsutils.utilUtilMod.ImportKind.ExportFrom with Double = js.native
    
    /* 1 */ val ImportDeclaration: typings.tsutils.utilUtilMod.ImportKind.ImportDeclaration with Double = js.native
    
    /* 2 */ val ImportEquals: typings.tsutils.utilUtilMod.ImportKind.ImportEquals with Double = js.native
    
    /* 32 */ val ImportType: typings.tsutils.utilUtilMod.ImportKind.ImportType with Double = js.native
    
    /* 16 */ val Require: typings.tsutils.utilUtilMod.ImportKind.Require with Double = js.native
  }
  
  @JSImport("tsutils/util", "ScopeBoundary")
  @js.native
  object ScopeBoundary extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ScopeBoundary with Double] = js.native
    
    /* 2 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundary.Block with Double = js.native
    
    /* 8 */ val ConditionalType: typings.tsutils.utilUtilMod.ScopeBoundary.ConditionalType with Double = js.native
    
    /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundary.Function with Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.ScopeBoundary.None with Double = js.native
    
    /* 4 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundary.Type with Double = js.native
  }
  
  @JSImport("tsutils/util", "ScopeBoundarySelector")
  @js.native
  object ScopeBoundarySelector extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ScopeBoundarySelector with Double] = js.native
    
    /* 3 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Block with Double = js.native
    
    /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Function with Double = js.native
    
    /* 8 */ val InferType: typings.tsutils.utilUtilMod.ScopeBoundarySelector.InferType with Double = js.native
    
    /* 7 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Type with Double = js.native
  }
  
  @JSImport("tsutils/util", "SideEffectOptions")
  @js.native
  object SideEffectOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.SideEffectOptions with Double] = js.native
    
    /* 2 */ val Constructor: typings.tsutils.utilUtilMod.SideEffectOptions.Constructor with Double = js.native
    
    /* 4 */ val JsxElement: typings.tsutils.utilUtilMod.SideEffectOptions.JsxElement with Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.SideEffectOptions.None with Double = js.native
    
    /* 1 */ val TaggedTemplate: typings.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate with Double = js.native
  }
  
  @JSImport("tsutils/util", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.usageMod.UsageDomain with Double] = js.native
    
    /* 7 */ val Any: typings.tsutils.usageMod.UsageDomain.Any with Double = js.native
    
    /* 1 */ val Namespace: typings.tsutils.usageMod.UsageDomain.Namespace with Double = js.native
    
    /* 2 */ val Type: typings.tsutils.usageMod.UsageDomain.Type with Double = js.native
    
    /* 8 */ val TypeQuery: typings.tsutils.usageMod.UsageDomain.TypeQuery with Double = js.native
    
    /* 4 */ val Value: typings.tsutils.usageMod.UsageDomain.Value with Double = js.native
    
    /* 5 */ val ValueOrNamespace: typings.tsutils.usageMod.UsageDomain.ValueOrNamespace with Double = js.native
  }
  
  @JSImport("tsutils/util", "VariableDeclarationKind")
  @js.native
  object VariableDeclarationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.VariableDeclarationKind with Double] = js.native
    
    /* 2 */ val Const: typings.tsutils.utilUtilMod.VariableDeclarationKind.Const with Double = js.native
    
    /* 1 */ val Let: typings.tsutils.utilUtilMod.VariableDeclarationKind.Let with Double = js.native
    
    /* 0 */ val Var: typings.tsutils.utilUtilMod.VariableDeclarationKind.Var with Double = js.native
  }
  
  @JSImport("tsutils/util", "canHaveJsDoc")
  @js.native
  def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = js.native
  
  @JSImport("tsutils/util", "collectVariableUsage")
  @js.native
  def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
  
  @JSImport("tsutils/util", "commentText")
  @js.native
  def commentText(sourceText: String, comment: CommentRange): String = js.native
  
  @JSImport("tsutils/util", "convertAst")
  @js.native
  def convertAst(sourceFile: SourceFile): ConvertedAst = js.native
  
  @JSImport("tsutils/util", "endsControlFlow")
  @js.native
  def endsControlFlow(statement: BlockLike): Boolean = js.native
  @JSImport("tsutils/util", "endsControlFlow")
  @js.native
  def endsControlFlow(statement: Statement): Boolean = js.native
  
  @JSImport("tsutils/util", "findImportLikeNodes")
  @js.native
  def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = js.native
  
  @JSImport("tsutils/util", "findImports")
  @js.native
  def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = js.native
  
  @JSImport("tsutils/util", "forEachComment")
  @js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  @JSImport("tsutils/util", "forEachComment")
  @js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils/util", "forEachDeclaredVariable")
  @js.native
  def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with Name, T]
  ): js.UndefOr[T] = js.native
  
  @JSImport("tsutils/util", "forEachDestructuringIdentifier")
  @js.native
  def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElementnameIdentif, T]): js.UndefOr[T] = js.native
  
  @JSImport("tsutils/util", "forEachToken")
  @js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  @JSImport("tsutils/util", "forEachToken")
  @js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils/util", "forEachTokenWithTrivia")
  @js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = js.native
  @JSImport("tsutils/util", "forEachTokenWithTrivia")
  @js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils/util", "getAccessKind")
  @js.native
  def getAccessKind(node: Node): AccessKind = js.native
  
  @JSImport("tsutils/util", "getCallSignaturesOfType")
  @js.native
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  
  @JSImport("tsutils/util", "getCheckJsDirective")
  @js.native
  def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = js.native
  
  @JSImport("tsutils/util", "getChildOfKind")
  @js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  @JSImport("tsutils/util", "getChildOfKind")
  @js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
  
  @JSImport("tsutils/util", "getCommentAtPosition")
  @js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  @JSImport("tsutils/util", "getCommentAtPosition")
  @js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
  
  @JSImport("tsutils/util", "getConstructorTypeOfClassLikeDeclaration")
  @js.native
  def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util", "getControlFlowEnd")
  @js.native
  def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = js.native
  @JSImport("tsutils/util", "getControlFlowEnd")
  @js.native
  def getControlFlowEnd(statement: Statement): ControlFlowEnd = js.native
  
  @JSImport("tsutils/util", "getDeclarationDomain")
  @js.native
  def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = js.native
  
  @JSImport("tsutils/util", "getDeclarationOfBindingElement")
  @js.native
  def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  
  @JSImport("tsutils/util", "getIIFE")
  @js.native
  def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = js.native
  @JSImport("tsutils/util", "getIIFE")
  @js.native
  def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = js.native
  
  @JSImport("tsutils/util", "getInstanceTypeOfClassLikeDeclaration")
  @js.native
  def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util", "getIteratorYieldResultFromIteratorResult")
  @js.native
  def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util", "getJsDoc")
  @js.native
  def getJsDoc(node: Node): js.Array[JSDoc] = js.native
  @JSImport("tsutils/util", "getJsDoc")
  @js.native
  def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  
  @JSImport("tsutils/util", "getLateBoundPropertyNames")
  @js.native
  def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = js.native
  
  @JSImport("tsutils/util", "getLateBoundPropertyNamesOfPropertyName")
  @js.native
  def getLateBoundPropertyNamesOfPropertyName(node: PropertyName, checker: TypeChecker): LateBoundPropertyNames = js.native
  
  @JSImport("tsutils/util", "getLineBreakStyle")
  @js.native
  def getLineBreakStyle(sourceFile: SourceFile): Linefeed | CarriagereturnLinefeed = js.native
  
  @JSImport("tsutils/util", "getLineRanges")
  @js.native
  def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = js.native
  
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils/util", "getModifier")
  @js.native
  def getModifier(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = js.native
  
  @JSImport("tsutils/util", "getNextStatement")
  @js.native
  def getNextStatement(statement: Statement): js.UndefOr[Statement] = js.native
  
  @JSImport("tsutils/util", "getNextToken")
  @js.native
  def getNextToken(node: Node): js.UndefOr[Node] = js.native
  @JSImport("tsutils/util", "getNextToken")
  @js.native
  def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils/util", "getPreviousStatement")
  @js.native
  def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = js.native
  
  @JSImport("tsutils/util", "getPreviousToken")
  @js.native
  def getPreviousToken(node: Node): js.UndefOr[Node] = js.native
  @JSImport("tsutils/util", "getPreviousToken")
  @js.native
  def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils/util", "getPropertyName")
  @js.native
  def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = js.native
  
  @JSImport("tsutils/util", "getPropertyNameFromType")
  @js.native
  def getPropertyNameFromType(`type`: Type): js.UndefOr[typings.tsutils.utilUtilMod.PropertyName] = js.native
  
  @JSImport("tsutils/util", "getPropertyNameOfWellKnownSymbol")
  @js.native
  def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): typings.tsutils.utilUtilMod.PropertyName = js.native
  
  @JSImport("tsutils/util", "getPropertyOfType")
  @js.native
  def getPropertyOfType(`type`: Type, name: typings.typescript.mod.String): js.UndefOr[Symbol] = js.native
  
  @JSImport("tsutils/util", "getSingleLateBoundPropertyNameOfPropertyName")
  @js.native
  def getSingleLateBoundPropertyNameOfPropertyName(node: PropertyName, checker: TypeChecker): js.UndefOr[typings.tsutils.utilUtilMod.PropertyName] = js.native
  
  @JSImport("tsutils/util", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  @JSImport("tsutils/util", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: js.UndefOr[scala.Nothing], allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  @JSImport("tsutils/util", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  @JSImport("tsutils/util", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils/util", "getUsageDomain")
  @js.native
  def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = js.native
  
  @JSImport("tsutils/util", "getVariableDeclarationKind")
  @js.native
  def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = js.native
  
  @JSImport("tsutils/util", "getWrappedNodeAtPosition")
  @js.native
  def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = js.native
  
  @JSImport("tsutils/util", "hasAccessModifier")
  @js.native
  def hasAccessModifier(node: ClassElement): Boolean = js.native
  @JSImport("tsutils/util", "hasAccessModifier")
  @js.native
  def hasAccessModifier(node: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils/util", "hasModifier")
  @js.native
  def hasModifier(
    modifiers: js.UndefOr[scala.Nothing],
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
  @JSImport("tsutils/util", "hasModifier")
  @js.native
  def hasModifier(
    modifiers: ModifiersArray,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
  
  @JSImport("tsutils/util", "hasOwnThisReference")
  @js.native
  def hasOwnThisReference(node: Node): Boolean = js.native
  
  @JSImport("tsutils/util", "hasSideEffects")
  @js.native
  def hasSideEffects(node: Expression): Boolean = js.native
  @JSImport("tsutils/util", "hasSideEffects")
  @js.native
  def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = js.native
  
  @JSImport("tsutils/util", "intersectionTypeParts")
  @js.native
  def intersectionTypeParts(`type`: Type): js.Array[Type] = js.native
  
  @JSImport("tsutils/util", "isAmbientModule")
  @js.native
  def isAmbientModule(node: ModuleDeclaration): Boolean = js.native
  
  @JSImport("tsutils/util", "isAmbientModuleBlock")
  @js.native
  def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  
  @JSImport("tsutils/util", "isAssignmentKind")
  @js.native
  def isAssignmentKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isBindableObjectDefinePropertyCall")
  @js.native
  def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = js.native
  
  @JSImport("tsutils/util", "isBlockScopeBoundary")
  @js.native
  def isBlockScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils/util", "isBlockScopedDeclarationStatement")
  @js.native
  def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = js.native
  
  @JSImport("tsutils/util", "isBlockScopedVariableDeclaration")
  @js.native
  def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = js.native
  
  @JSImport("tsutils/util", "isBlockScopedVariableDeclarationList")
  @js.native
  def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = js.native
  
  @JSImport("tsutils/util", "isBooleanLiteralType")
  @js.native
  def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = js.native
  
  @JSImport("tsutils/util", "isCompilerOptionEnabled")
  @js.native
  def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = js.native
  @JSImport("tsutils/util", "isCompilerOptionEnabled")
  @js.native
  def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = js.native
  
  @JSImport("tsutils/util", "isConstAssertion")
  @js.native
  def isConstAssertion(node: AssertionExpression): Boolean = js.native
  
  @JSImport("tsutils/util", "isEmptyObjectType")
  @js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  
  @JSImport("tsutils/util", "isExpressionValueUsed")
  @js.native
  def isExpressionValueUsed(node: Expression): Boolean = js.native
  
  @JSImport("tsutils/util", "isFalsyType")
  @js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util", "isFunctionScopeBoundary")
  @js.native
  def isFunctionScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils/util", "isFunctionWithBody")
  @js.native
  def isFunctionWithBody(node: Node): Boolean = js.native
  
  @JSImport("tsutils/util", "isInConstContext")
  @js.native
  def isInConstContext(node: Expression): Boolean = js.native
  
  @JSImport("tsutils/util", "isInSingleStatementContext")
  @js.native
  def isInSingleStatementContext(statement: Statement): Boolean = js.native
  
  @JSImport("tsutils/util", "isJsDocKind")
  @js.native
  def isJsDocKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isKeywordKind")
  @js.native
  def isKeywordKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isModifierFlagSet")
  @js.native
  def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  
  @JSImport("tsutils/util", "isNodeFlagSet")
  @js.native
  def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = js.native
  
  @JSImport("tsutils/util", "isNodeKind")
  @js.native
  def isNodeKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isNumericPropertyName")
  @js.native
  def isNumericPropertyName(name: String): Boolean = js.native
  @JSImport("tsutils/util", "isNumericPropertyName")
  @js.native
  def isNumericPropertyName(name: typings.typescript.mod.String): Boolean = js.native
  
  @JSImport("tsutils/util", "isObjectFlagSet")
  @js.native
  def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = js.native
  
  @JSImport("tsutils/util", "isParameterProperty")
  @js.native
  def isParameterProperty(node: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils/util", "isPositionInComment")
  @js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = js.native
  @JSImport("tsutils/util", "isPositionInComment")
  @js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
  
  @JSImport("tsutils/util", "isPropertyReadonlyInType")
  @js.native
  def isPropertyReadonlyInType(`type`: Type, name: typings.typescript.mod.String, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils/util", "isReadonlyAssignmentDeclaration")
  @js.native
  def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils/util", "isReassignmentTarget")
  @js.native
  def isReassignmentTarget(node: Expression): Boolean = js.native
  
  @JSImport("tsutils/util", "isSameLine")
  @js.native
  def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = js.native
  
  @JSImport("tsutils/util", "isScopeBoundary")
  @js.native
  def isScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils/util", "isStatementInAmbientContext")
  @js.native
  def isStatementInAmbientContext(node: Statement): Boolean = js.native
  
  @JSImport("tsutils/util", "isStrictCompilerOptionEnabled")
  @js.native
  def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = js.native
  
  @JSImport("tsutils/util", "isSymbolFlagSet")
  @js.native
  def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = js.native
  
  @JSImport("tsutils/util", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  @JSImport("tsutils/util", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  @JSImport("tsutils/util", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util", "isThisParameter")
  @js.native
  def isThisParameter(parameter: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils/util", "isTokenKind")
  @js.native
  def isTokenKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isTypeAssignableToNumber")
  @js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util", "isTypeAssignableToString")
  @js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util", "isTypeFlagSet")
  @js.native
  def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = js.native
  
  @JSImport("tsutils/util", "isTypeNodeKind")
  @js.native
  def isTypeNodeKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils/util", "isTypeScopeBoundary")
  @js.native
  def isTypeScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils/util", "isValidIdentifier")
  @js.native
  def isValidIdentifier(text: String): Boolean = js.native
  @JSImport("tsutils/util", "isValidIdentifier")
  @js.native
  def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils/util", "isValidJsxIdentifier")
  @js.native
  def isValidJsxIdentifier(text: String): Boolean = js.native
  @JSImport("tsutils/util", "isValidJsxIdentifier")
  @js.native
  def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils/util", "isValidNumericLiteral")
  @js.native
  def isValidNumericLiteral(text: String): Boolean = js.native
  @JSImport("tsutils/util", "isValidNumericLiteral")
  @js.native
  def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils/util", "isValidPropertyAccess")
  @js.native
  def isValidPropertyAccess(text: String): Boolean = js.native
  @JSImport("tsutils/util", "isValidPropertyAccess")
  @js.native
  def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils/util", "isValidPropertyName")
  @js.native
  def isValidPropertyName(text: String): Boolean = js.native
  @JSImport("tsutils/util", "isValidPropertyName")
  @js.native
  def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils/util", "isWellKnownSymbolLiterally")
  @js.native
  def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = js.native
  
  @JSImport("tsutils/util", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node): js.Array[JSDoc] = js.native
  @JSImport("tsutils/util", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: js.UndefOr[scala.Nothing], sourceFile: SourceFile): js.Array[JSDoc] = js.native
  @JSImport("tsutils/util", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  @JSImport("tsutils/util", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  
  @JSImport("tsutils/util", "removeOptionalityFromType")
  @js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  
  @JSImport("tsutils/util", "someTypePart")
  @js.native
  def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = js.native
  
  @JSImport("tsutils/util", "symbolHasReadonlyDeclaration")
  @js.native
  def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils/util", "unionTypeParts")
  @js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
  
  @JSImport("tsutils/util", "unwrapParentheses")
  @js.native
  def unwrapParentheses(node: Expression): Expression = js.native
}
