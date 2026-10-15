.class public final Landroidx/fragment/app/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/d;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/u;


# direct methods
.method public constructor <init>(Le/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/r;->a:Landroidx/fragment/app/u;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/r;->a:Landroidx/fragment/app/u;

    iget-object v2, v1, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v2, v2, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/t;

    iget-object v2, v2, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-static {v2}, Landroidx/fragment/app/u;->k(Landroidx/fragment/app/i0;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    iget-object v1, v1, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v1, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v1}, Landroidx/fragment/app/i0;->P()Landroidx/fragment/app/j0;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    return-object v0
.end method
