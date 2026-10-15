.class public Lf2/g;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public a:Lf2/l;

.field public b:Ly1/a;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/content/res/ColorStateList;

.field public final e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Landroid/graphics/PorterDuff$Mode;

.field public h:Landroid/graphics/Rect;

.field public final i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:F

.field public final o:F

.field public final p:I

.field public q:I

.field public r:I

.field public final s:I

.field public final t:Z

.field public final u:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Lf2/g;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->f:Landroid/content/res/ColorStateList;

    .line 5
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lf2/g;->h:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lf2/g;->i:F

    iput v0, p0, Lf2/g;->j:F

    const/16 v0, 0xff

    iput v0, p0, Lf2/g;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lf2/g;->m:F

    iput v0, p0, Lf2/g;->n:F

    iput v0, p0, Lf2/g;->o:F

    const/4 v0, 0x0

    iput v0, p0, Lf2/g;->p:I

    iput v0, p0, Lf2/g;->q:I

    iput v0, p0, Lf2/g;->r:I

    iput v0, p0, Lf2/g;->s:I

    iput-boolean v0, p0, Lf2/g;->t:Z

    .line 6
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lf2/g;->u:Landroid/graphics/Paint$Style;

    .line 7
    iget-object v0, p1, Lf2/g;->a:Lf2/l;

    iput-object v0, p0, Lf2/g;->a:Lf2/l;

    .line 8
    iget-object v0, p1, Lf2/g;->b:Ly1/a;

    iput-object v0, p0, Lf2/g;->b:Ly1/a;

    .line 9
    iget v0, p1, Lf2/g;->k:F

    iput v0, p0, Lf2/g;->k:F

    .line 10
    iget-object v0, p1, Lf2/g;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    .line 11
    iget-object v0, p1, Lf2/g;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->d:Landroid/content/res/ColorStateList;

    .line 12
    iget-object v0, p1, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    .line 13
    iget-object v0, p1, Lf2/g;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->f:Landroid/content/res/ColorStateList;

    .line 14
    iget v0, p1, Lf2/g;->l:I

    iput v0, p0, Lf2/g;->l:I

    .line 15
    iget v0, p1, Lf2/g;->i:F

    iput v0, p0, Lf2/g;->i:F

    .line 16
    iget v0, p1, Lf2/g;->r:I

    iput v0, p0, Lf2/g;->r:I

    .line 17
    iget v0, p1, Lf2/g;->p:I

    iput v0, p0, Lf2/g;->p:I

    .line 18
    iget-boolean v0, p1, Lf2/g;->t:Z

    iput-boolean v0, p0, Lf2/g;->t:Z

    .line 19
    iget v0, p1, Lf2/g;->j:F

    iput v0, p0, Lf2/g;->j:F

    .line 20
    iget v0, p1, Lf2/g;->m:F

    iput v0, p0, Lf2/g;->m:F

    .line 21
    iget v0, p1, Lf2/g;->n:F

    iput v0, p0, Lf2/g;->n:F

    .line 22
    iget v0, p1, Lf2/g;->o:F

    iput v0, p0, Lf2/g;->o:F

    .line 23
    iget v0, p1, Lf2/g;->q:I

    iput v0, p0, Lf2/g;->q:I

    .line 24
    iget v0, p1, Lf2/g;->s:I

    iput v0, p0, Lf2/g;->s:I

    .line 25
    iget-object v0, p1, Lf2/g;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->e:Landroid/content/res/ColorStateList;

    .line 26
    iget-object v0, p1, Lf2/g;->u:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lf2/g;->u:Landroid/graphics/Paint$Style;

    .line 27
    iget-object v0, p1, Lf2/g;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Lf2/g;->h:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lf2/g;->h:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lf2/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lf2/g;->f:Landroid/content/res/ColorStateList;

    .line 2
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lf2/g;->h:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lf2/g;->i:F

    iput v1, p0, Lf2/g;->j:F

    const/16 v1, 0xff

    iput v1, p0, Lf2/g;->l:I

    const/4 v1, 0x0

    iput v1, p0, Lf2/g;->m:F

    iput v1, p0, Lf2/g;->n:F

    iput v1, p0, Lf2/g;->o:F

    const/4 v1, 0x0

    iput v1, p0, Lf2/g;->p:I

    iput v1, p0, Lf2/g;->q:I

    iput v1, p0, Lf2/g;->r:I

    iput v1, p0, Lf2/g;->s:I

    iput-boolean v1, p0, Lf2/g;->t:Z

    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, Lf2/g;->u:Landroid/graphics/Paint$Style;

    iput-object p1, p0, Lf2/g;->a:Lf2/l;

    iput-object v0, p0, Lf2/g;->b:Ly1/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lf2/h;

    invoke-direct {v0, p0}, Lf2/h;-><init>(Lf2/g;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf2/h;->f:Z

    return-object v0
.end method
