package typings.babylonjs.legacyMod

import typings.babylonjs.anon.LightmapMode
import typings.babylonjs.effectMod.IEffectCreationOptions
import typings.babylonjs.prePassConfigurationMod.PrePassConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MaterialHelper")
@js.native
class MaterialHelper ()
  extends typings.babylonjs.indexMod.MaterialHelper
/* static members */
object MaterialHelper {
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Binds the bones information from the mesh to the effect.
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param prePassConfiguration Configuration for the prepass, in case prepass is activated
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(
    mesh: js.UndefOr[scala.Nothing],
    effect: js.UndefOr[scala.Nothing],
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(mesh: js.UndefOr[scala.Nothing], effect: typings.babylonjs.effectMod.Effect): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(
    mesh: js.UndefOr[scala.Nothing],
    effect: typings.babylonjs.effectMod.Effect,
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: js.UndefOr[scala.Nothing],
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, effect: typings.babylonjs.effectMod.Effect): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindBonesParameters")
  @js.native
  def BindBonesParameters(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  
  /**
    * Binds the clip plane information from the scene to the effect.
    * @param scene The scene the clip plane information are extracted from
    * @param effect The effect we are binding the data to
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindClipPlane")
  @js.native
  def BindClipPlane(effect: typings.babylonjs.effectMod.Effect, scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
  
  /**
    * Bind the current view position to an effect.
    * @param effect The effect to be bound
    * @param scene The scene the eyes position is used from
    * @param variableName name of the shader variable that will hold the eye position
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindEyePosition")
  @js.native
  def BindEyePosition(effect: typings.babylonjs.effectMod.Effect, scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindEyePosition")
  @js.native
  def BindEyePosition(
    effect: typings.babylonjs.effectMod.Effect,
    scene: typings.babylonjs.sceneMod.Scene,
    variableName: String
  ): Unit = js.native
  
  /**
    * Binds the fog information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param linearSpace Defines if the fog effect is applied in linear space
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindFogParameters")
  @js.native
  def BindFogParameters(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindFogParameters")
  @js.native
  def BindFogParameters(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    linearSpace: Boolean
  ): Unit = js.native
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param light Light to bind
    * @param lightIndex Light index
    * @param scene The scene where the light belongs to
    * @param effect The effect we are binding the data to
    * @param useSpecular Defines if specular is supported
    * @param rebuildInParallel Specifies whether the shader is rebuilding in parallel
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLight")
  @js.native
  def BindLight(
    light: typings.babylonjs.lightMod.Light,
    lightIndex: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    effect: typings.babylonjs.effectMod.Effect,
    useSpecular: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLight")
  @js.native
  def BindLight(
    light: typings.babylonjs.lightMod.Light,
    lightIndex: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    effect: typings.babylonjs.effectMod.Effect,
    useSpecular: Boolean,
    rebuildInParallel: Boolean
  ): Unit = js.native
  
  /**
    * Binds the light information to the effect.
    * @param light The light containing the generator
    * @param effect The effect we are binding the data to
    * @param lightIndex The light index in the effect used to render
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLightProperties")
  @js.native
  def BindLightProperties(
    light: typings.babylonjs.lightMod.Light,
    effect: typings.babylonjs.effectMod.Effect,
    lightIndex: Double
  ): Unit = js.native
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param defines The generated defines for the effect
    * @param maxSimultaneousLights The maximum number of light that can be bound to the effect
    * @param rebuildInParallel Specifies whether the shader is rebuilding in parallel
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLights")
  @js.native
  def BindLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    defines: js.Any
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLights")
  @js.native
  def BindLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    rebuildInParallel: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLights")
  @js.native
  def BindLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLights")
  @js.native
  def BindLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: Double,
    rebuildInParallel: Boolean
  ): Unit = js.native
  
  /**
    * Binds the logarithmic depth information from the scene to the effect for the given defines.
    * @param defines The generated defines used in the effect
    * @param effect The effect we are binding the data to
    * @param scene The scene we are willing to render with logarithmic scale for
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindLogDepth")
  @js.native
  def BindLogDepth(
    defines: js.Any,
    effect: typings.babylonjs.effectMod.Effect,
    scene: typings.babylonjs.sceneMod.Scene
  ): Unit = js.native
  
  /**
    * Binds the morph targets information from the mesh to the effect.
    * @param abstractMesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindMorphTargetParameters")
  @js.native
  def BindMorphTargetParameters(
    abstractMesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typings.babylonjs.effectMod.Effect
  ): Unit = js.native
  
  /**
    * Binds a texture matrix value to its corrsponding uniform
    * @param texture The texture to bind the matrix for
    * @param uniformBuffer The uniform buffer receivin the data
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.BindTextureMatrix")
  @js.native
  def BindTextureMatrix(
    texture: typings.babylonjs.baseTextureMod.BaseTexture,
    uniformBuffer: typings.babylonjs.uniformBufferMod.UniformBuffer,
    key: String
  ): Unit = js.native
  
  /**
    * Gets the current status of the fog (should it be enabled?)
    * @param mesh defines the mesh to evaluate for fog support
    * @param scene defines the hosting scene
    * @returns true if fog must be enabled
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.GetFogState")
  @js.native
  def GetFogState(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, scene: typings.babylonjs.sceneMod.Scene): Boolean = js.native
  
  /**
    * This helps decreasing rank by rank the shadow quality (0 being the highest rank and quality)
    * @param defines The defines to update while falling back
    * @param fallbacks The authorized effect fallbacks
    * @param maxSimultaneousLights The maximum number of lights allowed
    * @param rank the current rank of the Effect
    * @returns The newly affected rank
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.HandleFallbacksForShadows")
  @js.native
  def HandleFallbacksForShadows(defines: js.Any, fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks): Double = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.HandleFallbacksForShadows")
  @js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    rank: Double
  ): Double = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.HandleFallbacksForShadows")
  @js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: Double
  ): Double = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.HandleFallbacksForShadows")
  @js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: Double,
    rank: Double
  ): Double = js.native
  
  /**
    * Prepares the list of attributes required for bones according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the bones attributes for
    * @param defines The current Defines of the effect
    * @param fallbacks The current efffect fallback strategy
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareAttributesForBones")
  @js.native
  def PrepareAttributesForBones(
    attribs: js.Array[String],
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks
  ): Unit = js.native
  
  /**
    * Check and prepare the list of attributes required for instances according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param defines The current MaterialDefines of the effect
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareAttributesForInstances")
  @js.native
  def PrepareAttributesForInstances(attribs: js.Array[String], defines: typings.babylonjs.materialDefinesMod.MaterialDefines): Unit = js.native
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param defines The current Defines of the effect
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareAttributesForMorphTargets")
  @js.native
  def PrepareAttributesForMorphTargets(attribs: js.Array[String], mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, defines: js.Any): Unit = js.native
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param influencers The number of influencers
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareAttributesForMorphTargetsInfluencers")
  @js.native
  def PrepareAttributesForMorphTargetsInfluencers(
    attribs: js.Array[String],
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    influencers: Double
  ): Unit = js.native
  
  /**
    * Prepares the defines used in the shader depending on the attributes data available in the mesh
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    * @param useVertexColor Precise whether vertex colors should be used or not (override mesh info)
    * @param useBones Precise whether bones should be used or not (override mesh info)
    * @param useMorphTargets Precise whether morph targets should be used or not (override mesh info)
    * @param useVertexAlpha Precise whether vertex alpha should be used or not (override mesh info)
    * @returns false if defines are considered not dirty and have not been checked
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForAttributes")
  @js.native
  def PrepareDefinesForAttributes(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForAttributes")
  @js.native
  def PrepareDefinesForAttributes(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: js.UndefOr[scala.Nothing],
    useVertexAlpha: Boolean
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForAttributes")
  @js.native
  def PrepareDefinesForAttributes(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForAttributes")
  @js.native
  def PrepareDefinesForAttributes(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean,
    useVertexAlpha: Boolean
  ): Boolean = js.native
  
  /**
    * Prepares the defines for bones
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForBones")
  @js.native
  def PrepareDefinesForBones(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, defines: js.Any): Unit = js.native
  
  /**
    * Helper used to prepare the list of defines associated with frame values for shader compilation
    * @param scene defines the current scene
    * @param engine defines the current engine
    * @param defines specifies the list of active defines
    * @param useInstances defines if instances have to be turned on
    * @param useClipPlane defines if clip plane have to be turned on
    * @param useInstances defines if instances have to be turned on
    * @param useThinInstances defines if thin instances have to be turned on
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForFrameBoundValues")
  @js.native
  def PrepareDefinesForFrameBoundValues(
    scene: typings.babylonjs.sceneMod.Scene,
    engine: typings.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForFrameBoundValues")
  @js.native
  def PrepareDefinesForFrameBoundValues(
    scene: typings.babylonjs.sceneMod.Scene,
    engine: typings.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean,
    useClipPlane: js.UndefOr[Nullable[Boolean]],
    useThinInstances: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForFrameBoundValues")
  @js.native
  def PrepareDefinesForFrameBoundValues(
    scene: typings.babylonjs.sceneMod.Scene,
    engine: typings.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean,
    useClipPlane: Nullable[Boolean]
  ): Unit = js.native
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param light The light the effect is compiling for
    * @param lightIndex The index of the light
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param state Defines the current state regarding what is needed (normals, etc...)
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForLight")
  @js.native
  def PrepareDefinesForLight(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    light: typings.babylonjs.lightMod.Light,
    lightIndex: Double,
    defines: js.Any,
    specularSupported: Boolean,
    state: LightmapMode
  ): Unit = js.native
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param maxSimultaneousLights Specfies how manuy lights can be added to the effect at max
    * @param disableLighting Specifies whether the lighting is disabled (override scene and light)
    * @returns true if normals will be required for the rest of the effect
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForLights")
  @js.native
  def PrepareDefinesForLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForLights")
  @js.native
  def PrepareDefinesForLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    disableLighting: Boolean
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForLights")
  @js.native
  def PrepareDefinesForLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double
  ): Boolean = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForLights")
  @js.native
  def PrepareDefinesForLights(
    scene: typings.babylonjs.sceneMod.Scene,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double,
    disableLighting: Boolean
  ): Boolean = js.native
  
  /**
    * Helps preparing the defines values about the UVs in used in the effect.
    * UVs are shared as much as we can accross channels in the shaders.
    * @param texture The texture we are preparing the UVs for
    * @param defines The defines to update
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForMergedUV")
  @js.native
  def PrepareDefinesForMergedUV(texture: typings.babylonjs.baseTextureMod.BaseTexture, defines: js.Any, key: String): Unit = js.native
  
  /**
    * Helper used to prepare the list of defines associated with misc. values for shader compilation
    * @param mesh defines the current mesh
    * @param scene defines the current scene
    * @param useLogarithmicDepth defines if logarithmic depth has to be turned on
    * @param pointsCloud defines if point cloud rendering has to be turned on
    * @param fogEnabled defines if fog has to be turned on
    * @param alphaTest defines if alpha testing has to be turned on
    * @param defines defines the current list of defines
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForMisc")
  @js.native
  def PrepareDefinesForMisc(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene,
    useLogarithmicDepth: Boolean,
    pointsCloud: Boolean,
    fogEnabled: Boolean,
    alphaTest: Boolean,
    defines: js.Any
  ): Unit = js.native
  
  /**
    * Prepares the defines for morph targets
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForMorphTargets")
  @js.native
  def PrepareDefinesForMorphTargets(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, defines: js.Any): Unit = js.native
  
  /**
    * Prepares the defines related to multiview
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForMultiview")
  @js.native
  def PrepareDefinesForMultiview(scene: typings.babylonjs.sceneMod.Scene, defines: js.Any): Unit = js.native
  
  /**
    * Prepares the defines related to the prepass
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    * @param canRenderToMRT Indicates if this material renders to several textures in the prepass
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareDefinesForPrePass")
  @js.native
  def PrepareDefinesForPrePass(scene: typings.babylonjs.sceneMod.Scene, defines: js.Any, canRenderToMRT: Boolean): Unit = js.native
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect (for a specific light)
    * @param lightIndex defines the light index
    * @param uniformsList The uniform list
    * @param samplersList The sampler list
    * @param projectedLightTexture defines if projected texture must be used
    * @param uniformBuffersList defines an optional list of uniform buffers
    * @param updateOnlyBuffersList True to only update the uniformBuffersList array
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(lightIndex: Double, uniformsList: js.Array[String], samplersList: js.Array[String]): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.UndefOr[scala.Nothing],
    uniformBuffersList: js.UndefOr[Nullable[js.Array[String]]],
    updateOnlyBuffersList: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.UndefOr[scala.Nothing],
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any,
    uniformBuffersList: js.UndefOr[Nullable[js.Array[String]]],
    updateOnlyBuffersList: Boolean
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersForLight")
  @js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any,
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = js.native
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect
    * @param uniformsListOrOptions The uniform names to prepare or an EffectCreationOptions containing the liist and extra information
    * @param samplersList The sampler list
    * @param defines The defines helping in the list generation
    * @param maxSimultaneousLights The maximum number of simultanous light allowed in the effect
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String]): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.UndefOr[scala.Nothing], defines: js.Any): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String]): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String], defines: js.Any): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String]): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String], defines: js.Any): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PrepareUniformsAndSamplersList")
  @js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  
  /**
    * Add the list of attributes required for instances to the attribs array.
    * @param attribs The current list of supported attribs
    */
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper.PushAttributesForInstances")
  @js.native
  def PushAttributesForInstances(attribs: js.Array[String]): Unit = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper._CopyBonesTransformationMatrices")
  @js.native
  def _CopyBonesTransformationMatrices: js.Any = js.native
  @scala.inline
  def _CopyBonesTransformationMatrices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CopyBonesTransformationMatrices")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper._TmpMorphInfluencers")
  @js.native
  def _TmpMorphInfluencers: js.Any = js.native
  @scala.inline
  def _TmpMorphInfluencers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMorphInfluencers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialHelper._tempFogColor")
  @js.native
  def _tempFogColor: js.Any = js.native
  @scala.inline
  def _tempFogColor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tempFogColor")(x.asInstanceOf[js.Any])
}
