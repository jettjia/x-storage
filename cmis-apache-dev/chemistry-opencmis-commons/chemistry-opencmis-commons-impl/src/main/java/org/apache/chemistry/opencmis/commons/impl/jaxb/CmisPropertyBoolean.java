/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "cmisPropertyBoolean", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"value", "any"})
/*     */ public class CmisPropertyBoolean
/*     */   extends CmisProperty
/*     */ {
/*     */   @XmlElement(type = Boolean.class)
/*     */   protected List<Boolean> value;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   
/*     */   public List<Boolean> getValue() {
/*  72 */     if (this.value == null) {
/*  73 */       this.value = new ArrayList<>();
/*     */     }
/*  75 */     return this.value;
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
/* 102 */     if (this.any == null) {
/* 103 */       this.any = new ArrayList();
/*     */     }
/* 105 */     return this.any;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisPropertyBoolean.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */