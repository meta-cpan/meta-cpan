DESCRIPTION = "\"Module::Build\" is a system for building, testing, and installing Perl \
modules. It is meant to be an alternative to \"ExtUtils::MakeMaker\". \
Developers may alter the behavior of the module through subclassing in a \
much more straightforward way than with "MakeMaker". It also does not \
require a \"make\" on your system - most of the "Module::Build" code is \
pure-perl and written in a very cross-platform way."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-0.4224.tar.gz"

SRC_URI[md5sum] = "b74c2f6e84b60aad3a3defd30b6f0f4d"
SRC_URI[sha256sum] = "a6ca15d78244a7b50fdbf27f85c85f4035aa799ce7dd018a0d98b358ef7bc782"

RDEPENDS_${PN} += "perl"

#do_patch_module_build () {
#    cd ${S}
#    sed -i -e 's,my $interpreter = $self->{properties}{perl};,my $interpreter = "/usr/bin/perl";,g' lib/Module/Build/Base.pm
#}
#
#do_patch[postfuncs] += "do_patch_module_build"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
