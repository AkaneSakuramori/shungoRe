.class public final Li0/s1;
.super Li0/r1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li0/r1;-><init>()V

    return-void
.end method

.method public constructor <init>(Li0/c2;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Li0/r1;-><init>(Li0/c2;)V

    return-void
.end method


# virtual methods
.method public c(ILb0/c;)V
    .locals 1

    invoke-static {p1}, Li0/b2;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p2

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0, p1, p2}, Li0/x;->o(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
