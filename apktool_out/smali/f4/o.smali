.class public final Lf4/o;
.super La3/f;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final b:[Lf4/j;

.field public final c:[I


# direct methods
.method public constructor <init>([Lf4/j;[I)V
    .locals 0

    invoke-direct {p0}, La3/f;-><init>()V

    iput-object p1, p0, Lf4/o;->b:[Lf4/j;

    iput-object p2, p0, Lf4/o;->c:[I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lf4/o;->b:[Lf4/j;

    array-length v0, v0

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lf4/j;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lf4/j;

    invoke-super {p0, p1}, La3/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf4/o;->b:[Lf4/j;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lf4/j;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lf4/j;

    invoke-super {p0, p1}, La3/f;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lf4/j;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lf4/j;

    invoke-super {p0, p1}, La3/f;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
