.class public La3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La3/f;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La3/c;->a:I

    iput-object p1, p0, La3/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp3/b;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, La3/c;->a:I

    .line 5
    iget-object v0, p1, Lp3/b;->a:Lp3/c;

    .line 6
    invoke-interface {v0}, Lp3/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, La3/c;->c:Ljava/lang/Object;

    .line 7
    iget p1, p1, Lp3/b;->b:I

    iput p1, p0, La3/c;->b:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, La3/c;->a:I

    const-string v0, "array"

    .line 2
    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La3/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    iget v0, p0, La3/c;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, La3/c;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, La3/c;->b:I

    if-lez v0, :cond_0

    move-object v0, v3

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, La3/c;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La3/c;->b:I

    goto :goto_0

    :cond_0
    check-cast v3, Ljava/util/Iterator;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget v0, p0, La3/c;->b:I

    check-cast v3, [Ljava/lang/Object;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    move v1, v2

    :cond_1
    return v1

    :pswitch_1
    iget v0, p0, La3/c;->b:I

    check-cast v3, La3/f;

    invoke-virtual {v3}, La3/b;->a()I

    move-result v3

    if-ge v0, v3, :cond_2

    move v1, v2

    :cond_2
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La3/c;->a:I

    iget-object v1, p0, La3/c;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, La3/c;->b:I

    if-lez v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, La3/c;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La3/c;->b:I

    goto :goto_0

    :cond_0
    check-cast v1, Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    :try_start_0
    check-cast v1, [Ljava/lang/Object;

    iget v0, p0, La3/c;->b:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, La3/c;->b:I

    aget-object v0, v1, v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget v1, p0, La3/c;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La3/c;->b:I

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    invoke-virtual {p0}, La3/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast v1, La3/f;

    iget v0, p0, La3/c;->b:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, La3/c;->b:I

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, La3/c;->a:I

    const-string v1, "Operation is not supported for read-only collection"

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
