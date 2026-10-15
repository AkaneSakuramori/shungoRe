.class public final Lj0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final a:Lj0/d;


# direct methods
.method public constructor <init>(Lj0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/e;->a:Lj0/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lj0/e;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lj0/e;

    iget-object v0, p0, Lj0/e;->a:Lj0/d;

    iget-object p1, p1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lj0/e;->a:Lj0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 2

    iget-object v0, p0, Lj0/e;->a:Lj0/d;

    check-cast v0, Ll0/b;

    iget-object v0, v0, Ll0/b;->a:Ljava/lang/Object;

    check-cast v0, Li2/k;

    iget-object v1, v0, Li2/k;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/TextView;->getInputType()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    iget-object v0, v0, Li2/o;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Li0/e0;->s(Landroid/view/View;I)V

    :cond_2
    :goto_1
    return-void
.end method
