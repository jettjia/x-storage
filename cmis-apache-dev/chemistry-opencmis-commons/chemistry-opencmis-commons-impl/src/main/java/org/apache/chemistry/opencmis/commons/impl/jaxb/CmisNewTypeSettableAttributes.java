/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @XmlType(name = "cmisNewTypeSettableAttributes", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"id", "localName", "localNamespace", "displayName", "queryName", "description", "creatable", "fileable", "queryable", "fulltextIndexed", "includedInSupertypeQuery", "controllablePolicy", "controllableACL"})
/*     */ public class CmisNewTypeSettableAttributes
/*     */ {
/*     */   protected boolean id;
/*     */   protected boolean localName;
/*     */   protected boolean localNamespace;
/*     */   protected boolean displayName;
/*     */   protected boolean queryName;
/*     */   protected boolean description;
/*     */   protected boolean creatable;
/*     */   protected boolean fileable;
/*     */   protected boolean queryable;
/*     */   protected boolean fulltextIndexed;
/*     */   protected boolean includedInSupertypeQuery;
/*     */   protected boolean controllablePolicy;
/*     */   protected boolean controllableACL;
/*     */   
/*     */   public boolean isId() {
/*  77 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(boolean value) {
/*  85 */     this.id = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isLocalName() {
/*  93 */     return this.localName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLocalName(boolean value) {
/* 101 */     this.localName = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isLocalNamespace() {
/* 109 */     return this.localNamespace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLocalNamespace(boolean value) {
/* 117 */     this.localNamespace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDisplayName() {
/* 125 */     return this.displayName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisplayName(boolean value) {
/* 133 */     this.displayName = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isQueryName() {
/* 141 */     return this.queryName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQueryName(boolean value) {
/* 149 */     this.queryName = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDescription() {
/* 157 */     return this.description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescription(boolean value) {
/* 165 */     this.description = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCreatable() {
/* 173 */     return this.creatable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreatable(boolean value) {
/* 181 */     this.creatable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFileable() {
/* 189 */     return this.fileable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFileable(boolean value) {
/* 197 */     this.fileable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isQueryable() {
/* 205 */     return this.queryable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQueryable(boolean value) {
/* 213 */     this.queryable = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFulltextIndexed() {
/* 221 */     return this.fulltextIndexed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFulltextIndexed(boolean value) {
/* 229 */     this.fulltextIndexed = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIncludedInSupertypeQuery() {
/* 237 */     return this.includedInSupertypeQuery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIncludedInSupertypeQuery(boolean value) {
/* 245 */     this.includedInSupertypeQuery = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isControllablePolicy() {
/* 253 */     return this.controllablePolicy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControllablePolicy(boolean value) {
/* 261 */     this.controllablePolicy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isControllableACL() {
/* 269 */     return this.controllableACL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControllableACL(boolean value) {
/* 277 */     this.controllableACL = value;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisNewTypeSettableAttributes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */