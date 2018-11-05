DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-CleanNamespaces"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-CleanNamespaces-0.23.tar.gz"

SRC_URI[md5sum] = "2eeeb5d382c72010e6a175637e78785c"
SRC_URI[sha256sum] = "c7bf97f3c786b75f84341135904b492a1a36646aa65db3e0fd15a3cbe0864872"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "sub-identify-perl"
RRECOMMENDS_${PN} += "package-stash-xs-perl"
DEPENDS += "file-pushd-perl-native"
DEPENDS += "namespace-clean-perl-native"
DEPENDS += "sub-exporter-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Test-CleanNamespaces-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
