.class public final Landroidx/fragment/app/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;
.implements Lz0/g;
.implements Landroidx/lifecycle/r0;


# instance fields
.field public final b:Landroidx/lifecycle/q0;

.field public c:Landroidx/lifecycle/t;

.field public d:Lz0/f;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/q0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    iput-object v0, p0, Landroidx/fragment/app/z0;->d:Lz0/f;

    iput-object p1, p0, Landroidx/fragment/app/z0;->b:Landroidx/lifecycle/q0;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/l;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    invoke-static {p0}, Lz0/c;->b(Lz0/g;)Lz0/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/z0;->d:Lz0/f;

    :cond_0
    return-void
.end method

.method public final e()Lz0/e;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/z0;->c()V

    iget-object v0, p0, Landroidx/fragment/app/z0;->d:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    return-object v0
.end method

.method public final h()Landroidx/lifecycle/q0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/z0;->c()V

    iget-object v0, p0, Landroidx/fragment/app/z0;->b:Landroidx/lifecycle/q0;

    return-object v0
.end method

.method public final t()Landroidx/lifecycle/t;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/z0;->c()V

    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    return-object v0
.end method
