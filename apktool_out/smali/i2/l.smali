.class public final Li2/l;
.super Lz1/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Li2/n;


# direct methods
.method public constructor <init>(Li2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/l;->b:Li2/n;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, Li2/l;->b:Li2/n;

    invoke-virtual {p1}, Li2/n;->b()Li2/o;

    move-result-object p1

    invoke-virtual {p1}, Li2/o;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, Li2/l;->b:Li2/n;

    invoke-virtual {p1}, Li2/n;->b()Li2/o;

    move-result-object p1

    invoke-virtual {p1}, Li2/o;->b()V

    return-void
.end method
