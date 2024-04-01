/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
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
/*     */ @XmlType(name = "enumAllowableActionsKey", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*     */ @XmlEnum
/*     */ public enum EnumAllowableActionsKey
/*     */ {
/*  60 */   CAN_GET_DESCENDENTS_FOLDER("canGetDescendents.Folder"),
/*     */   
/*  62 */   CAN_GET_CHILDREN_FOLDER("canGetChildren.Folder"),
/*     */   
/*  64 */   CAN_GET_PARENTS_FOLDER("canGetParents.Folder"),
/*     */   
/*  66 */   CAN_GET_FOLDER_PARENT_OBJECT("canGetFolderParent.Object"),
/*     */   
/*  68 */   CAN_CREATE_DOCUMENT_FOLDER("canCreateDocument.Folder"),
/*     */   
/*  70 */   CAN_CREATE_FOLDER_FOLDER("canCreateFolder.Folder"),
/*     */   
/*  72 */   CAN_CREATE_RELATIONSHIP_SOURCE("canCreateRelationship.Source"),
/*     */   
/*  74 */   CAN_CREATE_RELATIONSHIP_TARGET("canCreateRelationship.Target"),
/*     */   
/*  76 */   CAN_GET_PROPERTIES_OBJECT("canGetProperties.Object"),
/*     */   
/*  78 */   CAN_VIEW_CONTENT_OBJECT("canViewContent.Object"),
/*     */   
/*  80 */   CAN_UPDATE_PROPERTIES_OBJECT("canUpdateProperties.Object"),
/*     */   
/*  82 */   CAN_MOVE_OBJECT("canMove.Object"),
/*     */   
/*  84 */   CAN_MOVE_TARGET("canMove.Target"),
/*     */   
/*  86 */   CAN_MOVE_SOURCE("canMove.Source"),
/*     */   
/*  88 */   CAN_DELETE_OBJECT("canDelete.Object"),
/*     */   
/*  90 */   CAN_DELETE_TREE_FOLDER("canDeleteTree.Folder"),
/*     */   
/*  92 */   CAN_SET_CONTENT_DOCUMENT("canSetContent.Document"),
/*     */   
/*  94 */   CAN_DELETE_CONTENT_DOCUMENT("canDeleteContent.Document"),
/*     */   
/*  96 */   CAN_ADD_TO_FOLDER_OBJECT("canAddToFolder.Object"),
/*     */   
/*  98 */   CAN_ADD_TO_FOLDER_FOLDER("canAddToFolder.Folder"),
/*     */   
/* 100 */   CAN_REMOVE_FROM_FOLDER_OBJECT("canRemoveFromFolder.Object"),
/*     */   
/* 102 */   CAN_REMOVE_FROM_FOLDER_FOLDER("canRemoveFromFolder.Folder"),
/*     */   
/* 104 */   CAN_CHECKOUT_DOCUMENT("canCheckout.Document"),
/*     */   
/* 106 */   CAN_CANCEL_CHECKOUT_DOCUMENT("canCancelCheckout.Document"),
/*     */   
/* 108 */   CAN_CHECKIN_DOCUMENT("canCheckin.Document"),
/*     */   
/* 110 */   CAN_GET_ALL_VERSIONS_VERSION_SERIES("canGetAllVersions.VersionSeries"),
/*     */   
/* 112 */   CAN_GET_OBJECT_RELATIONSHIPS_OBJECT("canGetObjectRelationships.Object"),
/*     */   
/* 114 */   CAN_ADD_POLICY_OBJECT("canAddPolicy.Object"),
/*     */   
/* 116 */   CAN_ADD_POLICY_POLICY("canAddPolicy.Policy"),
/*     */   
/* 118 */   CAN_REMOVE_POLICY_OBJECT("canRemovePolicy.Object"),
/*     */   
/* 120 */   CAN_REMOVE_POLICY_POLICY("canRemovePolicy.Policy"),
/*     */   
/* 122 */   CAN_GET_APPLIED_POLICIES_OBJECT("canGetAppliedPolicies.Object"),
/*     */   
/* 124 */   CAN_GET_ACL_OBJECT("canGetACL.Object"),
/*     */   
/* 126 */   CAN_APPLY_ACL_OBJECT("canApplyACL.Object");
/*     */   
/*     */   private final String value;
/*     */   
/*     */   EnumAllowableActionsKey(String v) {
/* 131 */     this.value = v;
/*     */   }
/*     */   
/*     */   public String value() {
/* 135 */     return this.value;
/*     */   }
/*     */   
/*     */   public static EnumAllowableActionsKey fromValue(String v) {
/* 139 */     for (EnumAllowableActionsKey c : values()) {
/* 140 */       if (c.value.equals(v)) {
/* 141 */         return c;
/*     */       }
/*     */     } 
/* 144 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumAllowableActionsKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */