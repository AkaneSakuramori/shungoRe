.class public final Lkotlinx/coroutines/internal/q;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# static fields
.field public static final d:Lkotlinx/coroutines/internal/q;

.field public static final e:Lkotlinx/coroutines/internal/q;

.field public static final f:Lkotlinx/coroutines/internal/q;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/q;-><init>(I)V

    sput-object v0, Lkotlinx/coroutines/internal/q;->d:Lkotlinx/coroutines/internal/q;

    new-instance v0, Lkotlinx/coroutines/internal/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/q;-><init>(I)V

    sput-object v0, Lkotlinx/coroutines/internal/q;->e:Lkotlinx/coroutines/internal/q;

    new-instance v0, Lkotlinx/coroutines/internal/q;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/q;-><init>(I)V

    sput-object v0, Lkotlinx/coroutines/internal/q;->f:Lkotlinx/coroutines/internal/q;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkotlinx/coroutines/internal/q;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkotlinx/coroutines/internal/q;->c:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lkotlinx/coroutines/internal/r;

    check-cast p2, Lc3/i;

    return-object p1

    :pswitch_0
    invoke-static {p1}, La;->n(Ljava/lang/Object;)V

    check-cast p2, Lc3/i;

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    check-cast p2, Lc3/i;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
