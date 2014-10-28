DESCRIPTION = "Exporter::Tiny supports many of Sub::Exporter's external-facing \
features including renaming imported functions with the \"-as\", \
\"-prefix\" and \
\"-suffix\" options; explicit destinations with the \"into\" option; \
and \
alternative installers with the \"installler\" option. But it's written \
in \
only about 40% as many lines of code and with zero non-core \
dependencies."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exporter-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-0.042.tar.gz"

SRC_URI[md5sum] = "77ba432037f35bc9b84b717639075fc6"
SRC_URI[sha256sum] = "8f1622c5ebbfbcd519ead81df7917e48cb16cc527b1c46737b0459c3908a023f"
RECOMMENDS += "test-fatal-perl-native"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
