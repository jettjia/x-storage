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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "cmisPropertiesType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"property", "any"})
/*     */ public class CmisPropertiesType
/*     */ {
/*     */   @XmlElements({@XmlElement(name = "propertyBoolean", type = CmisPropertyBoolean.class, nillable = true), @XmlElement(name = "propertyId", type = CmisPropertyId.class, nillable = true), @XmlElement(name = "propertyInteger", type = CmisPropertyInteger.class, nillable = true), @XmlElement(name = "propertyDateTime", type = CmisPropertyDateTime.class, nillable = true), @XmlElement(name = "propertyDecimal", type = CmisPropertyDecimal.class, nillable = true), @XmlElement(name = "propertyHtml", type = CmisPropertyHtml.class, nillable = true), @XmlElement(name = "propertyString", type = CmisPropertyString.class, nillable = true), @XmlElement(name = "propertyUri", type = CmisPropertyUri.class, nillable = true)})
/*     */   protected List<CmisProperty> property;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAnyAttribute
/*  70 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<CmisProperty> getProperty() {
/* 103 */     if (this.property == null) {
/* 104 */       this.property = new ArrayList<>();
/*     */     }
/* 106 */     return this.property;
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
/* 133 */     if (this.any == null) {
/* 134 */       this.any = new ArrayList();
/*     */     }
/* 136 */     return this.any;
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
/* 154 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisPropertiesType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */