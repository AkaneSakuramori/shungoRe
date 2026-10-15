.class public abstract Ly0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly0/h0;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/h0;

    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    iput-object v0, p0, Ly0/g0;->a:Ly0/h0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/g0;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b(I)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public abstract c(Ly0/d1;I)V
.end method

.method public abstract d(Landroidx/recyclerview/widget/RecyclerView;)Ly0/d1;
.end method
