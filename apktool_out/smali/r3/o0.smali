.class public final Lr3/o0;
.super Lkotlinx/coroutines/internal/b;
.source "SourceFile"


# instance fields
.field public final b:Lkotlinx/coroutines/internal/f;

.field public c:Lkotlinx/coroutines/internal/f;

.field public final synthetic d:Lr3/p0;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/f;Lr3/p0;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lr3/o0;->d:Lr3/p0;

    iput-object p3, p0, Lr3/o0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Lkotlinx/coroutines/internal/b;-><init>()V

    iput-object p1, p0, Lr3/o0;->b:Lkotlinx/coroutines/internal/f;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lkotlinx/coroutines/internal/f;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lr3/o0;->b:Lkotlinx/coroutines/internal/f;

    if-eqz p2, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lr3/o0;->c:Lkotlinx/coroutines/internal/f;

    :goto_1
    if-eqz v1, :cond_4

    sget-object v2, Lkotlinx/coroutines/internal/f;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v2, p1, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_4

    iget-object p1, p0, Lr3/o0;->c:Lkotlinx/coroutines/internal/f;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/f;->g(Lkotlinx/coroutines/internal/f;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    :cond_4
    :goto_2
    return-void
.end method

.method public final c(Ljava/lang/Object;)Lg1/e;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/internal/f;

    iget-object p1, p0, Lr3/o0;->d:Lr3/p0;

    invoke-virtual {p1}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lr3/o0;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, Lkotlinx/coroutines/internal/a;->c:Lg1/e;

    :goto_0
    return-object p1
.end method
