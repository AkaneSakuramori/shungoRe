.class public abstract Ld1/k;
.super Ld1/j;
.source "SourceFile"


# instance fields
.field public a:[Lb0/f;

.field public b:Ljava/lang/String;

.field public c:I

.field public final d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/k;->a:[Lb0/f;

    const/4 v0, 0x0

    iput v0, p0, Ld1/k;->c:I

    return-void
.end method

.method public constructor <init>(Ld1/k;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/k;->a:[Lb0/f;

    const/4 v0, 0x0

    iput v0, p0, Ld1/k;->c:I

    .line 3
    iget-object v0, p1, Ld1/k;->b:Ljava/lang/String;

    iput-object v0, p0, Ld1/k;->b:Ljava/lang/String;

    .line 4
    iget v0, p1, Ld1/k;->d:I

    iput v0, p0, Ld1/k;->d:I

    .line 5
    iget-object p1, p1, Ld1/k;->a:[Lb0/f;

    invoke-static {p1}, Lc3/h;->E0([Lb0/f;)[Lb0/f;

    move-result-object p1

    iput-object p1, p0, Ld1/k;->a:[Lb0/f;

    return-void
.end method


# virtual methods
.method public getPathData()[Lb0/f;
    .locals 1

    iget-object v0, p0, Ld1/k;->a:[Lb0/f;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Lb0/f;)V
    .locals 6

    iget-object v0, p0, Ld1/k;->a:[Lb0/f;

    invoke-static {v0, p1}, Lc3/h;->Q([Lb0/f;[Lb0/f;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lc3/h;->E0([Lb0/f;)[Lb0/f;

    move-result-object p1

    iput-object p1, p0, Ld1/k;->a:[Lb0/f;

    goto :goto_2

    :cond_0
    iget-object v0, p0, Ld1/k;->a:[Lb0/f;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    aget-object v4, p1, v2

    iget-char v4, v4, Lb0/f;->a:C

    iput-char v4, v3, Lb0/f;->a:C

    move v3, v1

    :goto_1
    aget-object v4, p1, v2

    iget-object v4, v4, Lb0/f;->b:[F

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v5, v0, v2

    iget-object v5, v5, Lb0/f;->b:[F

    aget v4, v4, v3

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
