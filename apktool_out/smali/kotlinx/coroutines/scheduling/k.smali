.class public final Lkotlinx/coroutines/scheduling/k;
.super Lr3/k;
.source "SourceFile"


# static fields
.field public static final d:Lkotlinx/coroutines/scheduling/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/scheduling/k;

    invoke-direct {v0}, Lr3/k;-><init>()V

    sput-object v0, Lkotlinx/coroutines/scheduling/k;->d:Lkotlinx/coroutines/scheduling/k;

    return-void
.end method


# virtual methods
.method public final z(Lc3/k;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lkotlinx/coroutines/scheduling/d;->e:Lkotlinx/coroutines/scheduling/d;

    sget-object v0, Lkotlinx/coroutines/scheduling/j;->g:Lf2/e;

    iget-object p1, p1, Lkotlinx/coroutines/scheduling/g;->d:Lkotlinx/coroutines/scheduling/b;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lkotlinx/coroutines/scheduling/b;->e(Ljava/lang/Runnable;Lf2/e;Z)V

    return-void
.end method
