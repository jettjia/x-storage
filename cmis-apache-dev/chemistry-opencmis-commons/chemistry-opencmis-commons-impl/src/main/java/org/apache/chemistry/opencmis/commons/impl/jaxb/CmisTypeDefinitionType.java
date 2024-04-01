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
/*     */ import javax.xml.bind.annotation.XmlElements;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
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
/*     */ @XmlType(name = "cmisTypeDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"id", "localName", "localNamespace", "displayName", "queryName", "description", "baseId", "parentId", "creatable", "fileable", "queryable", "fulltextIndexed", "includedInSupertypeQuery", "controllablePolicy", "controllableACL", "typeMutability", "propertyDefinition", "any"})
/*     */ @XmlSeeAlso({CmisTypeDocumentDefinitionType.class, CmisTypeFolderDefinitionType.class, CmisTypeRelationshipDefinitionType.class, CmisTypePolicyDefinitionType.class, CmisTypeItemDefinitionType.class, CmisTypeSecondaryDefinitionType.class})
/*     */ public class CmisTypeDefinitionType
/*     */ {
/*     */   @XmlElement(required = true)
/*     */   protected String id;
/*     */   @XmlElement(required = true)
/*     */   protected String localName;
/*     */   @XmlElement(required = true, nillable = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String localNamespace;
/*     */   protected String displayName;
/*     */   protected String queryName;
/*     */   protected String description;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumBaseObjectTypeIds baseId;
/*     */   protected String parentId;
/*     */   protected boolean creatable;
/*     */   protected boolean fileable;
/*     */   protected boolean queryable;
/*     */   protected boolean fulltextIndexed;
/*     */   @XmlElement(defaultValue = "true")
/*     */   protected boolean includedInSupertypeQuery;
/*     */   protected boolean controllablePolicy;
/*     */   protected boolean controllableACL;
/*     */   protected CmisTypeMutabilityCapabilitiesType typeMutability;
/*     */   @XmlElements({@XmlElement(name = "propertyBooleanDefinition", type = CmisPropertyBooleanDefinitionType.class), @XmlElement(name = "propertyDateTimeDefinition", type = CmisPropertyDateTimeDefinitionType.class), @XmlElement(name = "propertyDecimalDefinition", type = CmisPropertyDecimalDefinitionType.class), @XmlElement(name = "propertyIdDefinition", type = CmisPropertyIdDefinitionType.class), @XmlElement(name = "propertyIntegerDefinition", type = CmisPropertyIntegerDefinitionType.class), @XmlElement(name = "propertyHtmlDefinition", type = CmisPropertyHtmlDefinitionType.class), @XmlElement(name = "propertyStringDefinition", type = CmisPropertyStringDefinitionType.class), @XmlElement(name = "propertyUriDefinition", type = CmisPropertyUriDefinitionType.class)})
/*     */   protected List<CmisPropertyDefinitionType> propertyDefinition;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAnyAttribute
/* 135 */   private Map<QName, String> otherAttributes = new HashMap<>();
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
/*     */   public String getId() {
/* 147 */     return this.id;
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
/*     */   public void setId(String value) {
/* 159 */     this.id = value;
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
/*     */   public String getLocalName() {
/* 171 */     return this.localName;
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
/*     */   public void setLocalName(String value) {
/* 183 */     this.localName = value;
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
/*     */   public String getLocalNamespace() {
/* 195 */     return this.localNamespace;
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
/*     */   public void setLocalNamespace(String value) {
/* 207 */     this.localNamespace = value;
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
/*     */   public String getDisplayName() {
/* 219 */     return this.displayName;
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
/*     */   public void setDisplayName(String value) {
/* 231 */     this.displayName = value;
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
/*     */   public String getQueryName() {
/* 243 */     return this.queryName;
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
/*     */   public void setQueryName(String value) {
/* 255 */     this.queryName = value;
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
/*     */   public String getDescription() {
/* 267 */     return this.description;
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
/*     */   public void setDescription(String value) {
/* 279 */     this.description = value;
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
/*     */   public EnumBaseObjectTypeIds getBaseId() {
/* 291 */     return this.baseId;
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
/*     */   public void setBaseId(EnumBaseObjectTypeIds value) {
/* 303 */     this.baseId = value;
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
/*     */   public String getParentId() {
/* 315 */     return this.parentId;
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
/*     */   public void setParentId(String value) {
/* 327 */     this.parentId = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCreatable() {
/* 335 */     return this.creatable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreatable(boolean value) {
/* 343 */     this.creatable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFileable() {
/* 351 */     return this.fileable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFileable(boolean value) {
/* 359 */     this.fileable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isQueryable() {
/* 367 */     return this.queryable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQueryable(boolean value) {
/* 375 */     this.queryable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFulltextIndexed() {
/* 383 */     return this.fulltextIndexed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFulltextIndexed(boolean value) {
/* 391 */     this.fulltextIndexed = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIncludedInSupertypeQuery() {
/* 399 */     return this.includedInSupertypeQuery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIncludedInSupertypeQuery(boolean value) {
/* 407 */     this.includedInSupertypeQuery = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isControllablePolicy() {
/* 415 */     return this.controllablePolicy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControllablePolicy(boolean value) {
/* 423 */     this.controllablePolicy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isControllableACL() {
/* 431 */     return this.controllableACL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControllableACL(boolean value) {
/* 439 */     this.controllableACL = value;
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
/*     */   public CmisTypeMutabilityCapabilitiesType getTypeMutability() {
/* 451 */     return this.typeMutability;
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
/*     */   public void setTypeMutability(CmisTypeMutabilityCapabilitiesType value) {
/* 463 */     this.typeMutability = value;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<CmisPropertyDefinitionType> getPropertyDefinition() {
/* 496 */     if (this.propertyDefinition == null) {
/* 497 */       this.propertyDefinition = new ArrayList<>();
/*     */     }
/* 499 */     return this.propertyDefinition;
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
/*     */   
/*     */   public List<Object> getAny() {
/* 526 */     if (this.any == null) {
/* 527 */       this.any = new ArrayList();
/*     */     }
/* 529 */     return this.any;
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
/* 547 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisTypeDefinitionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */