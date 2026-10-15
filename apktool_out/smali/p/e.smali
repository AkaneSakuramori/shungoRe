.class public Lp/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:[Ljava/lang/Object;

.field public c:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    iput p2, p0, Lp/e;->a:I

    const/4 v0, 0x1

    const-string v1, "The max pool size must be > 0"

    if-eq p2, v0, :cond_1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lp/e;->b:[Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_2

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lp/e;->b:[Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lp/e;->a:I

    iget-object v1, p0, Lp/e;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lp/e;->c:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    aget-object v3, v1, v0

    aput-object v2, v1, v0

    iput v0, p0, Lp/e;->c:I

    move-object v2, v3

    :cond_0
    return-object v2

    :pswitch_0
    iget v0, p0, Lp/e;->c:I

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    aget-object v3, v1, v0

    aput-object v2, v1, v0

    iput v0, p0, Lp/e;->c:I

    move-object v2, v3

    :cond_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 5

    iget v0, p0, Lp/e;->a:I

    iget-object v1, p0, Lp/e;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    move v0, v2

    :goto_0
    iget v4, p0, Lp/e;->c:I

    if-ge v0, v4, :cond_1

    aget-object v4, v1, v0

    if-eq v4, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in the pool!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    array-length v0, v1

    if-ge v4, v0, :cond_2

    aput-object p1, v1, v4

    add-int/2addr v4, v3

    iput v4, p0, Lp/e;->c:I

    move v2, v3

    :cond_2
    return v2

    :pswitch_0
    iget v0, p0, Lp/e;->c:I

    array-length v4, v1

    if-ge v0, v4, :cond_3

    aput-object p1, v1, v0

    add-int/2addr v0, v3

    iput v0, p0, Lp/e;->c:I

    move v2, v3

    :cond_3
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
