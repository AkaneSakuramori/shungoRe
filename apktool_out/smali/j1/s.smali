.class public final Lj1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/google/android/material/datepicker/l;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0302e6

    .line 4
    invoke-static {v1, p1, v0}, Lc3/h;->m2(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    sget-object v1, Ln1/a;->l:[I

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 7
    invoke-static {p1, v1}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v1

    iput-object v1, p0, Lj1/s;->a:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 9
    invoke-static {p1, v1}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v1

    iput-object v1, p0, Lj1/s;->g:Ljava/lang/Object;

    const/4 v1, 0x3

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 11
    invoke-static {p1, v1}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v1

    iput-object v1, p0, Lj1/s;->b:Ljava/lang/Object;

    const/4 v1, 0x5

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 13
    invoke-static {p1, v1}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v1

    iput-object v1, p0, Lj1/s;->c:Ljava/lang/Object;

    const/4 v1, 0x7

    .line 14
    invoke-static {p1, v0, v1}, Lc3/h;->P0(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/16 v3, 0x9

    .line 15
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 16
    invoke-static {p1, v3}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v3

    iput-object v3, p0, Lj1/s;->d:Ljava/lang/Object;

    const/16 v3, 0x8

    .line 17
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 18
    invoke-static {p1, v3}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object v3

    iput-object v3, p0, Lj1/s;->e:Ljava/lang/Object;

    const/16 v3, 0xa

    .line 19
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 20
    invoke-static {p1, v2}, Li/r;->b(Landroid/content/Context;I)Li/r;

    move-result-object p1

    iput-object p1, p0, Lj1/s;->f:Ljava/lang/Object;

    .line 21
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lj1/s;->h:Ljava/lang/Object;

    .line 22
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lj1/a;)V
    .locals 1

    const-string v0, "audience"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/s;->a:Ljava/lang/Object;

    iput-object p2, p0, Lj1/s;->b:Ljava/lang/Object;

    iput-object p3, p0, Lj1/s;->e:Ljava/lang/Object;

    return-void
.end method
