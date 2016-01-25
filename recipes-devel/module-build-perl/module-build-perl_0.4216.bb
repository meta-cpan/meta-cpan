DESCRIPTION = ""Module::Build\" is a system for building, testing, and installing Perl \
modules. It is meant to be an alternative to \"ExtUtils::MakeMaker\". \
Developers may alter the behavior of the module through subclassing in \
a much more straightforward way than with \"MakeMaker\". It also does not \
require a \"make\" on your system - most of the \"Module::Build\" code is \
pure-perl and written in a very cross-platform way."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-0.4216.tar.gz"

SRC_URI[md5sum] = "681e174d184087d7e5bf64a338c5e48c"
SRC_URI[sha256sum] = "661e030ee9f83027e8a5067788175d53050b5d1292be1bfd85d44ad141fb7671"
RDEPENDS_${PN} += "perl"

do_patch_module_build () {
    cd ${S}
    sed -i -e 's,my $interpreter = $self->{properties}{perl};,my $interpreter = "/usr/bin/perl";,g' lib/Module/Build/Base.pm
}

do_patch[postfuncs] += "do_patch_module_build"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
