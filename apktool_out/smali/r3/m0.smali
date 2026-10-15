.class public final Lr3/m0;
.super Lr3/l0;
.source "SourceFile"


# instance fields
.field public final f:Lr3/p0;

.field public final g:Lr3/n0;

.field public final h:Lr3/d;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr3/p0;Lr3/n0;Lr3/d;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/f;-><init>()V

    iput-object p1, p0, Lr3/m0;->f:Lr3/p0;

    iput-object p2, p0, Lr3/m0;->g:Lr3/n0;

    iput-object p3, p0, Lr3/m0;->h:Lr3/d;

    iput-object p4, p0, Lr3/m0;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr3/m0;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 7

    iget-object p1, p0, Lr3/m0;->f:Lr3/p0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lr3/m0;->h:Lr3/d;

    invoke-static {v0}, Lr3/p0;->A(Lkotlinx/coroutines/internal/f;)Lr3/d;

    move-result-object v0

    iget-object v1, p0, Lr3/m0;->g:Lr3/n0;

    iget-object v2, p0, Lr3/m0;->i:Ljava/lang/Object;

    if-eqz v0, :cond_2

    :cond_0
    new-instance v3, Lr3/m0;

    invoke-direct {v3, p1, v1, v0, v2}, Lr3/m0;-><init>(Lr3/p0;Lr3/n0;Lr3/d;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, v0, Lr3/d;->f:Lr3/e;

    invoke-static {v6, v4, v3, v5}, Lr3/q;->l(Lr3/i0;ZLr3/l0;I)Lr3/y;

    move-result-object v3

    sget-object v4, Lr3/s0;->b:Lr3/s0;

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lr3/p0;->A(Lkotlinx/coroutines/internal/f;)Lr3/d;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_2
    invoke-virtual {p1, v1, v2}, Lr3/p0;->o(Lr3/n0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lr3/p0;->d(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
