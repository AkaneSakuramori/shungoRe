.class public final Lr3/h0;
.super Lr3/k0;
.source "SourceFile"


# static fields
.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _invoked:I

.field public final f:Lj3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lr3/h0;

    const-string v1, "_invoked"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lr3/h0;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lr3/l0;)V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/f;-><init>()V

    iput-object p1, p0, Lr3/h0;->f:Lj3/l;

    const/4 p1, 0x0

    iput p1, p0, Lr3/h0;->_invoked:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr3/h0;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Lr3/h0;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr3/h0;->f:Lj3/l;

    invoke-interface {v0, p1}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
