.class public final Landroidx/fragment/app/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/c1;

.field public final synthetic c:Landroidx/fragment/app/c1;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c1;Landroidx/fragment/app/c1;ZLn/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/e;->b:Landroidx/fragment/app/c1;

    iput-object p2, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/c1;

    iput-boolean p3, p0, Landroidx/fragment/app/e;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/e;->b:Landroidx/fragment/app/c1;

    iget-object v0, v0, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/c1;

    iget-object v1, v1, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-boolean v2, p0, Landroidx/fragment/app/e;->d:Z

    invoke-static {v0, v1, v2}, Landroidx/fragment/app/r0;->a(Landroidx/fragment/app/q;Landroidx/fragment/app/q;Z)V

    return-void
.end method
