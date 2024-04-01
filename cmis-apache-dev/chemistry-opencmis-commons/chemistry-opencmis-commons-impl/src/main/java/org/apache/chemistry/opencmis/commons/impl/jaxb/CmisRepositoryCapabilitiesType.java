/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "cmisRepositoryCapabilitiesType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"capabilityACL", "capabilityAllVersionsSearchable", "capabilityChanges", "capabilityContentStreamUpdatability", "capabilityGetDescendants", "capabilityGetFolderTree", "capabilityOrderBy", "capabilityMultifiling", "capabilityPWCSearchable", "capabilityPWCUpdatable", "capabilityQuery", "capabilityRenditions", "capabilityUnfiling", "capabilityVersionSpecificFiling", "capabilityJoin", "capabilityCreatablePropertyTypes", "capabilityNewTypeSettableAttributes", "any"})
/*     */ public class CmisRepositoryCapabilitiesType
/*     */ {
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityACL capabilityACL;
/*     */   protected boolean capabilityAllVersionsSearchable;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityChanges capabilityChanges;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityContentStreamUpdates capabilityContentStreamUpdatability;
/*     */   protected boolean capabilityGetDescendants;
/*     */   protected boolean capabilityGetFolderTree;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityOrderBy capabilityOrderBy;
/*     */   protected boolean capabilityMultifiling;
/*     */   protected boolean capabilityPWCSearchable;
/*     */   protected boolean capabilityPWCUpdatable;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityQuery capabilityQuery;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityRendition capabilityRenditions;
/*     */   protected boolean capabilityUnfiling;
/*     */   protected boolean capabilityVersionSpecificFiling;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumCapabilityJoin capabilityJoin;
/*     */   protected CmisCreatablePropertyTypesType capabilityCreatablePropertyTypes;
/*     */   protected CmisNewTypeSettableAttributes capabilityNewTypeSettableAttributes;
/*     */   @XmlAnyElement
/*     */   protected List<Element> any;
/*     */   @XmlAnyAttribute
/* 113 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityACL getCapabilityACL() {
/* 125 */     return this.capabilityACL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityACL(EnumCapabilityACL value) {
/* 137 */     this.capabilityACL = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityAllVersionsSearchable() {
/* 145 */     return this.capabilityAllVersionsSearchable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityAllVersionsSearchable(boolean value) {
/* 153 */     this.capabilityAllVersionsSearchable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityChanges getCapabilityChanges() {
/* 165 */     return this.capabilityChanges;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityChanges(EnumCapabilityChanges value) {
/* 177 */     this.capabilityChanges = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityContentStreamUpdates getCapabilityContentStreamUpdatability() {
/* 189 */     return this.capabilityContentStreamUpdatability;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityContentStreamUpdatability(EnumCapabilityContentStreamUpdates value) {
/* 201 */     this.capabilityContentStreamUpdatability = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityGetDescendants() {
/* 209 */     return this.capabilityGetDescendants;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityGetDescendants(boolean value) {
/* 217 */     this.capabilityGetDescendants = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityGetFolderTree() {
/* 225 */     return this.capabilityGetFolderTree;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityGetFolderTree(boolean value) {
/* 233 */     this.capabilityGetFolderTree = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityOrderBy getCapabilityOrderBy() {
/* 245 */     return this.capabilityOrderBy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityOrderBy(EnumCapabilityOrderBy value) {
/* 257 */     this.capabilityOrderBy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityMultifiling() {
/* 265 */     return this.capabilityMultifiling;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityMultifiling(boolean value) {
/* 273 */     this.capabilityMultifiling = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityPWCSearchable() {
/* 281 */     return this.capabilityPWCSearchable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityPWCSearchable(boolean value) {
/* 289 */     this.capabilityPWCSearchable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityPWCUpdatable() {
/* 297 */     return this.capabilityPWCUpdatable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityPWCUpdatable(boolean value) {
/* 305 */     this.capabilityPWCUpdatable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityQuery getCapabilityQuery() {
/* 317 */     return this.capabilityQuery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityQuery(EnumCapabilityQuery value) {
/* 329 */     this.capabilityQuery = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityRendition getCapabilityRenditions() {
/* 341 */     return this.capabilityRenditions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityRenditions(EnumCapabilityRendition value) {
/* 353 */     this.capabilityRenditions = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityUnfiling() {
/* 361 */     return this.capabilityUnfiling;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityUnfiling(boolean value) {
/* 369 */     this.capabilityUnfiling = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCapabilityVersionSpecificFiling() {
/* 377 */     return this.capabilityVersionSpecificFiling;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityVersionSpecificFiling(boolean value) {
/* 385 */     this.capabilityVersionSpecificFiling = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumCapabilityJoin getCapabilityJoin() {
/* 397 */     return this.capabilityJoin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityJoin(EnumCapabilityJoin value) {
/* 409 */     this.capabilityJoin = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CmisCreatablePropertyTypesType getCapabilityCreatablePropertyTypes() {
/* 421 */     return this.capabilityCreatablePropertyTypes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityCreatablePropertyTypes(CmisCreatablePropertyTypesType value) {
/* 433 */     this.capabilityCreatablePropertyTypes = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CmisNewTypeSettableAttributes getCapabilityNewTypeSettableAttributes() {
/* 445 */     return this.capabilityNewTypeSettableAttributes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapabilityNewTypeSettableAttributes(CmisNewTypeSettableAttributes value) {
/* 457 */     this.capabilityNewTypeSettableAttributes = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Element> getAny() {
/* 483 */     if (this.any == null) {
/* 484 */       this.any = new ArrayList<>();
/*     */     }
/* 486 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<QName, String> getOtherAttributes() {
/* 504 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisRepositoryCapabilitiesType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */