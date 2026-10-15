.class public final Li2/f;
.super Lf2/g;
.source "SourceFile"


# instance fields
.field public final v:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lf2/l;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lf2/g;-><init>(Lf2/l;)V

    iput-object p2, p0, Li2/f;->v:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Li2/f;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf2/g;-><init>(Lf2/g;)V

    .line 3
    iget-object p1, p1, Li2/f;->v:Landroid/graphics/RectF;

    iput-object p1, p0, Li2/f;->v:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Li2/g;

    invoke-direct {v0, p0}, Li2/h;-><init>(Li2/f;)V

    invoke-virtual {v0}, Lf2/h;->invalidateSelf()V

    return-object v0
.end method
