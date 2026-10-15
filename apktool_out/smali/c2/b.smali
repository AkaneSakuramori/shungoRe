.class public final Lc2/b;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lc3/h;

.field public final synthetic k:Lc2/d;


# direct methods
.method public constructor <init>(Lc2/d;Lc3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/b;->k:Lc2/d;

    iput-object p2, p0, Lc2/b;->j:Lc3/h;

    return-void
.end method


# virtual methods
.method public final G1(I)V
    .locals 2

    iget-object v0, p0, Lc2/b;->k:Lc2/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc2/d;->m:Z

    iget-object v0, p0, Lc2/b;->j:Lc3/h;

    invoke-virtual {v0, p1}, Lc3/h;->G1(I)V

    return-void
.end method

.method public final H1(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lc2/b;->k:Lc2/d;

    iget v1, v0, Lc2/d;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, Lc2/d;->n:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lc2/d;->m:Z

    iget-object p1, v0, Lc2/d;->n:Landroid/graphics/Typeface;

    const/4 v0, 0x0

    iget-object v1, p0, Lc2/b;->j:Lc3/h;

    invoke-virtual {v1, p1, v0}, Lc3/h;->I1(Landroid/graphics/Typeface;Z)V

    return-void
.end method
