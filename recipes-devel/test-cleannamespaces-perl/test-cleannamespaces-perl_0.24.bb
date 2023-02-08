DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-CleanNamespaces"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-CleanNamespaces-0.24.tar.gz"

SRC_URI[md5sum] = "0ddfb7e5f11ddfb9498cb500c7616fb8"
SRC_URI[sha256sum] = "338d5569e8e89a654935f843ec0bc84aaa486fe8dd1898fb9cab3eccecd5327a"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "package-stash-perl"
RDEPENDS:${PN} += "sub-identify-perl"
RRECOMMENDS:${PN} += "package-stash-xs-perl"
DEPENDS += "file-pushd-perl-native"
DEPENDS += "namespace-clean-perl-native"
DEPENDS += "sub-exporter-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Test-CleanNamespaces-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
