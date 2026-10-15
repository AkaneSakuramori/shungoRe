.class public final Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/b;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/u;


# direct methods
.method public constructor <init>(Le/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/u;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/u;

    iget-object v1, v0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v1, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/t;

    iget-object v2, v1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v1, v3}, Landroidx/fragment/app/i0;->b(Landroidx/fragment/app/t;Lc3/h;Landroidx/fragment/app/q;)V

    iget-object v1, v0, Landroidx/activity/n;->f:Lz0/f;

    iget-object v1, v1, Lz0/f;->b:Lz0/e;

    const-string v2, "android:support:fragments"

    invoke-virtual {v1, v2}, Lz0/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    iget-object v0, v0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    instance-of v2, v0, Landroidx/lifecycle/r0;

    if-eqz v2, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->O(Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
