.class public final synthetic Lm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm/c;->a:I

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, Lm/c;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, [B

    check-cast p2, [B

    array-length v0, p1

    array-length v2, p2

    if-eq v0, v2, :cond_0

    array-length p1, p1

    array-length p2, p2

    sub-int v1, p1, p2

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_2

    aget-byte v2, p1, v0

    aget-byte v3, p2, v0

    if-eq v2, v3, :cond_1

    sub-int v1, v2, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :pswitch_0
    check-cast p1, [B

    check-cast p2, [B

    if-ne p1, p2, :cond_3

    goto :goto_3

    :cond_3
    if-nez p1, :cond_4

    const/4 v1, -0x1

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    move v0, v1

    :goto_2
    array-length v2, p1

    array-length v3, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v0, v2, :cond_7

    aget-byte v2, p1, v0

    aget-byte v3, p2, v0

    if-eq v2, v3, :cond_6

    sub-int v1, v2, v3

    goto :goto_3

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    array-length v0, p1

    array-length v2, p2

    if-eq v0, v2, :cond_8

    array-length p1, p1

    array-length p2, p2

    sub-int v1, p1, p2

    :cond_8
    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
